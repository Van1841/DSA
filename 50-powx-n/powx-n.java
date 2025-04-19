/*class Solution {
    public double myPow(double x, int n) {
        return(Math.pow(x,n)); 
        // a one liner code with the help of Math fucntions
        // makes the code easy and short.
    }
}
*/
class Solution {
    public double data; 

    public double myPow(double x, int n) {
        data = 1.0;  
        power(x, n); 
        return data;
    }

    public void power(double x, int n) {
        if (n == 0) {
            data = 1.0; 
            return;
        }
        if (n < 0) {
            data = Math.pow(x, n); 
            return;
        }
        data = Math.pow(x, n); 
    }
}