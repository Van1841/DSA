class Solution {
    public int firstUniqChar(String s) {
        Map <Character, Integer> ans = new HashMap<>();

        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(ans.containsKey(ch)){
                ans.put(ch, ans.get(ch) + 1);
            }else{
                ans.put(ch,1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ans.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}