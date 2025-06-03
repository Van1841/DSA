class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        char forS [] = s.toCharArray();
        char forT [] = t.toCharArray();

        Arrays.sort(forS);
        Arrays.sort(forT);

        return Arrays.equals(forS, forT);


        // if(s.length() != t.length()){
        //     return false;
        // }
        // for(int i = 0; i < s.length() ; i++){
        //     if(!t.contains(s.charAt(i))){
        //         return false;
        //     }
        // }
        // return true;
    }
}