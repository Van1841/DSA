class Solution {
    public String removeOuterParentheses(String s) {
        // dekh ismei sabhse pehle hme logic dekhna hai so lets consider
        //  "(" --> to be +1 and ")" --> to be -1
        // String builder se we can append the ans
        // and count to make sure ki kab konsa char append hona chahiye!

        int count = 0;
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()){
                        
            if(c ==')'){
                count--;
            }
            if(count != 0){
                ans.append(c);
            }
            if(c =='('){                    //tis would not be valid in string hence CHAR !
                count++;
            }
        }
        return ans.toString();
    }
}