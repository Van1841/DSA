class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;

        if (n<0){
            return false;
            // System.out.println("false");
        }

        while (n>0){
            int last = n % 10;
            rev = rev *10 +last;
            n=n/10;
        }
        
        if (rev == x){
            return true;
            // System.out.println("true");
        }else{
            return false;
        }

    }
}