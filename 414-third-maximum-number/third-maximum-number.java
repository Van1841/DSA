class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long s_max = Long.MIN_VALUE;
        long t_max = Long.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max || nums[i] == s_max || nums[i] == t_max) continue;
            
            if (nums[i] > max) {
                t_max = s_max;
                s_max = max;
                max = nums[i];
            } else if (nums[i] > s_max) {
                t_max = s_max;
                s_max = nums[i];
            } else if (nums[i] > t_max) {
                t_max = nums[i];
            }
        }
        
        return (t_max == Long.MIN_VALUE) ? (int) max : (int) t_max;
    }
}
