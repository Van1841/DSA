class Solution {
    public String reverseVowels(String s) {
        // convering pointers -->
        int left = 0;
        int right = s.length() - 1;
        char temp;
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";

        while(left < right){
            while(left < right && vowels.indexOf(word[left]) == -1){
                left++;
            }
            while(left < right && vowels.indexOf(word[right]) == -1){
                right--;
            }

            temp = word[left];
            word[left] = word[right];
            word[right] = temp;

            left ++;
            right--;
            
        }
        String ans = new String(word);
        return ans;
    }
}