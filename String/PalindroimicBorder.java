//Problem Link : https://www.hackerrank.com/challenges/palindromic-border
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.util.Arrays;

public class PalindroimicBorder {

    static int[][] arr;
    static int[] arr1, arr2, arr3;
    static int var;

    static int newNode(int l) {
        arr2[var] = l;
        return var++;
    }

    static int get(int i, char c) {
        return arr[c - 'a'][i];
    }

    static void set(int i, char c, int n) {
        arr[c - 'a'][i] = n;
    }

    public static void solve(Input in, PrintWriter out) throws IOException {
        char[] s = in.next().toCharArray();
        int n = s.length;
        arr = new int[8][n + 2];
        for (int[] ar : arr) {
            Arrays.fill(ar, -1);
        }
        arr2 = new int[n + 2];
        arr1 = new int[n + 2];
        arr3 = new int[n + 2];
        int root0 = newNode(0);
        int root1 = newNode(-1);
        arr1[root0] = arr1[root1] = root1;
        int cur = root0;
        for (int i = 0; i < n; ++i) {
            while (i - arr2[cur] == 0 || s[i] != s[i - arr2[cur] - 1]) {
                cur = arr1[cur];
            }
            if (get(cur, s[i]) == -1) {
                set(cur, s[i], newNode(arr2[cur] + 2));
                if (cur == root1) {
                    arr1[get(cur, s[i])] = root0;
                } else {
                    int cur1 = arr1[cur];
                    while (s[i] != s[i - arr2[cur1] - 1]) {
                        cur1 = arr1[cur1];
                    }
                    arr1[get(cur, s[i])] = get(cur1, s[i]);
                }
            }
            cur = get(cur, s[i]);
            arr3[cur]++;
        }
        long ans = 0;
        for (int i = var - 1; i >= 0; --i) {
            arr3[arr1[i]] += arr3[i];
            if (arr2[i] > 0) {
                ans = (ans + 1L * arr3[i] * (arr3[i] - 1) / 2) % 1000000007;
            }
        }
        out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        solve(new Input(new BufferedReader(new InputStreamReader(System.in))), out);
        out.close();
    }

    static class Input {
        BufferedReader in;
        StringBuilder sb = new StringBuilder();

        public Input(BufferedReader in) {
            this.in = in;
        }

        public Input(String s) {
            this.in = new BufferedReader(new StringReader(s));
        }

        public String next() throws IOException {
            sb.setLength(0);
            while (true) {
                int c = in.read();
                if (c == -1) {
                    return null;
                }
                if (" \n\r\t".indexOf(c) == -1) {
                    sb.append((char)c);
                    break;
                }
            }
            while (true) {
                int c = in.read();
                if (c == -1 || " \n\r\t".indexOf(c) != -1) {
                    break;
                }
                sb.append((char)c);
            }
            return sb.toString();
        }

    }
}
