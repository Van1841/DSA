class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder SB = new StringBuilder();
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length-1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            SB.append(last[i]);
        }
        return SB.toString();
    }
}