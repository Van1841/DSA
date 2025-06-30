class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n != 4){
            int sum = 0;
            while(n > 0){
                int d = n % 10;
                int pro = d * d;
                sum += pro;
                n = n / 10;
            }
            n = sum;
        }
        return (n == 1)? true : false;
    }
}