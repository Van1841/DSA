class Solution {
    public int maxProduct(int[] arr) {
        int pre = 1;
        int suf = 1;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++){
            if(pre == 0){
                pre = 1;
            }
            if(suf == 0){
                suf = 1;
            }
            pre = pre * arr[i];
            suf = suf * arr[arr.length -1 -i];
            max = Math.max(max, Math.max(pre,suf));
        }
        return max;
    }
}