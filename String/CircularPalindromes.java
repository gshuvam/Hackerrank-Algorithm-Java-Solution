//Problem URL : https://www.hackerrank.com/challenges/circular-palindromes
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class CircularPalindromes {

    private InputStream is;
    private PrintWriter pw;
    private String s = "";
    private final byte[] incur = new byte[1024];
    private int leaf = 0, pref = 0;

    public static int[] palindrome(char[] str) {
        int n = str.length;
        int[] r = new int[2 * n];
        int k = 0;
        for (int i = 0, j = 0; i < 2 * n; i += k, j = Math.max(j - k, 0)) {
            while (i - j >= 0 && i + j + 1 < 2 * n && str[(i - j) / 2] == str[(i + j + 1) / 2])
                j++;
            r[i] = j;

            for (k = 1; i - k >= 0 && r[i] - k >= 0 && r[i - k] != r[i] - k; k++) {
                r[i + k] = Math.min(r[i - k], r[i] - k);
            }
        }
        return r;
    }

    public static void main(String[] args) throws Exception {
        new CircularPalindromes().run();
    }

    private static void tr(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    void solve() {
        int n = ni();
        char[] s = ns(n);
        char[] s2 = new char[2 * n];
        for (int i = 0; i < n; i++) {
            s2[i] = s2[i + n] = s[i];
        }
        int[] pal = palindrome(s2);

        long[] es = new long[16 * n];
        int p = 0;
        for (int i = 0; i < 4 * n; i += 2) {
            pal[i] = Math.min(pal[i], n - ((n & 1) ^ 1));
            es[p++] = (long) (i / 2) << 32 | i;
            es[p++] = (long) (i / 2 + pal[i] / 2) << 32 | i;
            es[p++] = (long) (i / 2 + n - pal[i] / 2 - 1) << 32 | i;
            es[p++] = (long) (i / 2 + n) << 32 | i;
        }
        for (int i = 1; i < 4 * n; i += 2) {
            pal[i] = Math.min(pal[i], n - ((n & 1)));
            es[p++] = (long) (i / 2) << 32 | i;
            es[p++] = (long) (i / 2 + pal[i] / 2) << 32 | i;
            es[p++] = (long) (i / 2 + n - pal[i] / 2) << 32 | i;
            es[p++] = (long) (i / 2 + n) << 32 | i;
        }

        Arrays.sort(es, 0, p);
        MaxHeap inc = new MaxHeap(4 * n + 1);
        MaxHeap dec = new MaxHeap(4 * n + 1);
        MaxHeap flat = new MaxHeap(4 * n + 1);

        int[] st = new int[4 * n];
        int q = 0;
        for (int i = 0; i < 2 * n - 1; i++) {
            while (q < p && es[q] >>> 32 <= i) {
                int ind = (int) es[q];
                if (st[ind] == 0) {
                    inc.add(ind, (pal[ind] & 1) - 2 * i);
                } else if (st[ind] == 1) {
                    inc.remove(ind);
                    flat.add(ind, pal[ind]);
                } else if (st[ind] == 2) {
                    flat.remove(ind);
                    dec.add(ind, pal[ind] + 2 * i);
                } else if (st[ind] == 3) {
                    dec.remove(ind);
                }
                st[ind]++;
                q++;
            }
            if (i >= n - 1) {
                int max = 0;
                if (inc.size() > 0) max = Math.max(inc.max() + 2 * i, max);
                if (dec.size() > 0) max = Math.max(dec.max() - 2 * i, max);
                max = Math.max(flat.max(), max);
                pw.println(max);
            }
        }
    }

    void run() {
        is = s.isEmpty() ? System.in : new ByteArrayInputStream(s.getBytes());
        pw = new PrintWriter(System.out);

        long s = System.currentTimeMillis();
        solve();
        pw.flush();
        if (!this.s.isEmpty()) tr(System.currentTimeMillis() - s + "ms");
    }

    private int readByte() {
        if (leaf == -1) throw new InputMismatchException();
        if (pref >= leaf) {
            pref = 0;
            try {
                leaf = is.read(incur);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (leaf <= 0) return -1;
        }
        return incur[pref++];
    }

    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
        return b;
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    public static class MaxHeap {
        public static int INF = Integer.MIN_VALUE;
        public int[] a;
        public int[] map;
        public int[] arr1;
        public int n;
        public int pos;

        public MaxHeap(int m) {
            n = m + 2;
            a = new int[n];
            map = new int[n];
            arr1 = new int[n];
            Arrays.fill(a, INF);
            Arrays.fill(map, -1);
            Arrays.fill(arr1, -1);
            pos = 1;
        }

        public void add(int ind, int x) {
            int ret = arr1[ind];
            if (arr1[ind] < 0) {
                a[pos] = x;
                map[pos] = ind;
                arr1[ind] = pos;
                pos++;
                up(pos - 1);
            }
        }

        public void remove(int ind) {
            if (pos == 1) return;
            if (arr1[ind] == -1) return;

            pos--;
            int rem = arr1[ind];
            int ret = a[rem];
            map[rem] = map[pos];
            arr1[map[pos]] = rem;
            arr1[ind] = -1;
            a[rem] = a[pos];
            a[pos] = INF;
            map[pos] = -1;

            up(rem);
            down(rem);
        }

        public int max() {
            return a[1];
        }

        public int size() {
            return pos - 1;
        }

        private void up(int cur) {
            for (int c = cur, p = c >>> 1; p >= 1 && a[p] < a[c]; c >>>= 1, p >>>= 1) {
                int d = a[p];
                a[p] = a[c];
                a[c] = d;
                int e = arr1[map[p]];
                arr1[map[p]] = arr1[map[c]];
                arr1[map[c]] = e;
                e = map[p];
                map[p] = map[c];
                map[c] = e;
            }
        }

        private void down(int cur) {
            for (int c = cur; 2 * c < pos; ) {
                int b = a[2 * c] > a[2 * c + 1] ? 2 * c : 2 * c + 1;
                if (a[b] > a[c]) {
                    int d = a[c];
                    a[c] = a[b];
                    a[b] = d;
                    int e = arr1[map[c]];
                    arr1[map[c]] = arr1[map[b]];
                    arr1[map[b]] = e;
                    e = map[c];
                    map[c] = map[b];
                    map[b] = e;
                    c = b;
                }
                else {
                    break;
                }
            }
        }
    }
}
