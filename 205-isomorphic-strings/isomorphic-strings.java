class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            char ori = s.charAt(i);
            char repl = t.charAt(i);

            if(!map.containsKey(ori)){
                if(!map.containsValue(repl)){
                    map.put(ori,repl);
                }else{
                    return false;
                }
            }else{
                char mapped = map.get(ori);
                if (mapped != repl){
                    return false;
                }
            }
        }
        return true;
    }
}