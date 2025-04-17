class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        Map <Character, String> letters = new HashMap <>();
        letters.put('2' , "abc");
        letters.put('3' , "def");
        letters.put('4' , "ghi");
        letters.put('5' , "jkl");
        letters.put('6' , "mno");
        letters.put('7' , "pqrs");
        letters.put('8' , "tuv");
        letters.put('9' , "wxyz");

        fn(digits, 0 , new StringBuilder() , res , letters);
        return res;
    }

    private void fn (String digits, int index, StringBuilder comb, List<String> res, Map <Character, String> letters){
        if(index == digits.length()){
            res.add(comb.toString());
            return;
        }
        String lets = letters.get(digits.charAt(index));
        for(char i : lets.toCharArray()){
            comb.append(i);
            fn(digits,index+1,comb,res,letters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}