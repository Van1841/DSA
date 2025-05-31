class Solution {
    public String removeOuterParentheses(String s) {
        // dekh ismei sabhse pehle hme logic dekhna hai so lets consider
        //  "(" --> to be +1 and ")" --> to be -1

        int count = 0;
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c =='('){
                if(count != 0){
                    ans.append(c);
                }
                count++;
            }
            
            if(c ==')'){
                count--;
                if(count != 0){
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}