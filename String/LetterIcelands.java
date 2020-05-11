//Problem Link : https://www.hackerrank.com/challenges/letter-islands
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterIcelands {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        if (in.hasNext()) {
            final char[] str = in.next().toCharArray();
            if (str.length > 0 && in.hasNext()) {
                int k = in.nextInt();
                if (k > 0 && k <= str.length) {
                    System.out.println((new FoundSubStrings(str, k)).count());
                }
            }
        }
    }

    static class FoundSubStrings {

        private final char[] str;
        private final int k;
        private Map<Long, SubString> curr;
        private Map<Long, SubString> next;
        private SubString previousSub = null;
        private int previousSubParentStartIndex = -1;
        private int previousSubLen = -1;

        public FoundSubStrings(char[] str, int k) {
            this.str = str;
            this.k = k;
            int initialCapacity = str.length > 32 ? str.length >> 1 : str.length;
            curr = new HashMap<>(initialCapacity);
            next = new HashMap<>(initialCapacity);
        }

        public static long getKey(int parentStartIndex, int length, char chr) {
            return (((long) parentStartIndex) | ((long) length << 31) | ((long) chr) << 23);
        }

        public static long getKey(int length, char chr) {
            return (((long) length << 31) | (((long) chr) << 23));
        }

        public static long getKey(char chr) {
            return (((long) chr) << 23);
        }

        public long count() {
            long countResult = 0;
            int startIndex;
            char lastChar = str[0];
            int lastCharCount = 0;
            for (int i = 0; i <= str.length; i++) {
                if (i == str.length || lastChar != str[i]) {
                    if (lastCharCount > 1) {
                        for (int j = i - lastCharCount; j < i - 1; j++) {
                            this.add(j, lastChar, i - j);
                        }
                    }
                    this.add(i - 1, lastChar);
                    if (i != str.length) {
                        lastChar = str[i];
                        lastCharCount = 1;
                    }
                } else {
                    lastCharCount++;
                }
            }

            this.switchLists();

            while (!curr.isEmpty()) {
                for (SubString subStr : curr.values()) {
                    if (subStr.islands == k) {
                        countResult++;
                        if (k == 1 && subStr.size == 1) {
                            countResult += str.length - subStr.startIndex - subStr.len;
                            continue;
                        }
                    } else if (subStr.size < k) {
                        continue;
                    }
                    for (int i = 0; i < subStr.size && ((startIndex = subStr.indexes[i]) < (str.length - subStr.len)); i++) {
                        this.add(subStr.startIndex, startIndex, str[startIndex + subStr.len], subStr.len + 1, subStr.size);
                    }
                }
                this.switchLists();
            }
            return countResult;
        }

        private void add(int parentStartIndex, int startIndex, char chr, int len, int childLength) {
            if (previousSubParentStartIndex != parentStartIndex || previousSubLen != len || previousSub.chr != chr) {
                long key = getKey(parentStartIndex, len, chr);
                previousSub = next.get(key);
                if (previousSub == null) {
                    previousSub = new SubString(parentStartIndex, startIndex, chr, len, childLength);
                    next.put(key, previousSub);
                }
                previousSubParentStartIndex = previousSub.parentStartIndex;
                previousSubLen = len;
            }
            previousSub.addIndex(startIndex);
        }

        private void add(int startIndex, char chr, int len) {
            long key = getKey(len, chr);
            SubString sub = next.get(key);
            if (sub == null) {
                sub = new SubString(startIndex, chr, len);
                next.put(key, sub);
            }
            sub.addIndex(startIndex);
        }

        private void add(int startIndex, char chr) {
            if (previousSub == null || previousSubLen != 1 || previousSub.chr != chr) {
                long key = getKey(chr);
                previousSub = next.get(key);
                if (previousSub == null) {
                    previousSub = new SubString(startIndex, chr, 1);
                    next.put(key, previousSub);
                }
                previousSubLen = 1;
            }
            previousSub.addIndex(startIndex);
        }

        private void switchLists() {
            previousSubParentStartIndex = -1;
            previousSub = null;
            Map<Long, SubString> tmp = curr;
            curr = next;
            next = tmp;
            tmp.clear();
        }

        class SubString implements Comparable<SubString> {

            private final int parentStartIndex;
            private final int len;
            private final char chr;
            private final int startIndex;
            private int islands = 0;
            private int[] indexes;
            private int size = 0;

            public SubString(int startIndex, char chr, int length) {
                this(-1, startIndex, chr, length, 16);
            }

            public SubString(int startIndex, char chr, int length, int childLength) {
                this(-1, startIndex, chr, length, childLength);
            }

            public SubString(int parentStartIndex, int startIndex, char chr, int length, int childLength) {
                this.parentStartIndex = parentStartIndex;
                this.startIndex = startIndex;
                this.len = length;
                this.chr = chr;
                this.indexes = new int[childLength > 16 ? 16 : childLength + 1];
            }

            public void addIndex(int index) {
                if (size == 0 || (indexes[size - 1] + len < index)) {
                    islands++;
                }
                if (indexes.length == size + 1) {
                    int[] tmpArr = new int[indexes.length << 1];
                    System.arraycopy(indexes, 0, tmpArr, 0, indexes.length);
                    indexes = tmpArr;
                }
                indexes[size++] = index;
            }

            @Override
            public int compareTo(SubString o) {
                return (this.parentStartIndex == o.parentStartIndex) ? chr - o.chr :
                        this.parentStartIndex - o.parentStartIndex;
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder(100);
                sb.append("SubString{startIndex=").append(startIndex).append(", length=")
                        .append(len).append(", islands=")
                        .append(islands).append(", numberOfIndexes=")
                        .append(size).append(", arr=");
                for (int i = startIndex; i < startIndex + len; i++) {
                    sb.append(str[i]).append(',');
                }
                sb.setCharAt(sb.length() - 1, '}');
                return sb.toString();
            }
        }
    }
}
