class Solution {
    public int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0 ;

        while(far < nums.length -1){
            int veryfar = 0;
            for(int i = near; i <= far ; i++){
                veryfar = Math.max(veryfar, i + nums[i]);
            }
            near = far + 1 ;
            far = veryfar;
            jumps++;
        }
        return jumps;
    }
}