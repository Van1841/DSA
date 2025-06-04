class Solution {
    public boolean check(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length ; i++){
            int first = nums[i];
            int next = nums[(i+1) % nums.length];

            if(first > next){
                count++;
            }
        }
        return (count <= 1);
    }
}