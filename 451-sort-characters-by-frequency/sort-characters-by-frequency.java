class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Step 2: Create result string by choosing max freq character again & again
        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            int maxFreq = 0;
            char maxChar = 0;

            // Find the character with maximum frequency
            for (int i = 0; i < 256; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char) i;
                }
            }

            // Append it maxFreq times
            for (int i = 0; i < maxFreq; i++) {
                result.append(maxChar);
            }

            // Mark it as used
            freq[maxChar] = 0;
        }

        return result.toString();
    }
}
