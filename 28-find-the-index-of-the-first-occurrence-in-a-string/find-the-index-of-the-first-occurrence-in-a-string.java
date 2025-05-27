class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= m - n; i++) {  // Ensure we don't go out of bounds
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;  // Mismatch found, break the inner loop
                }
            }
            if (j == n) {  // If we successfully matched the whole needle
                return i;
            }
        }
        return -1; // Needle not found
    }
}