class Solution {
    public boolean canJump(int[] nums) {
        int maxi = 0;
        int destiny = nums.length - 1;

        for(int i = 0 ; i < nums.length; i ++){
            if(i > maxi){
                return false;
            }
            maxi = Math.max (maxi, i + nums[i]);
            if (maxi >= destiny){
                return true;
            }
        }
        return false;
    }
}