class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         } 
        //     }
        // }
        // return new int[]{};


        // int l = 0;
        // int r = l + 1;
        // while(r < nums.length){
        //     if(nums[l] + nums[r] == target){
        //         return new int[]{l,r};
        //     }
        //     r++;
        //     l++;
        // }
        // return new int[]{l,r};


        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(m.containsKey(target - nums[i])){
                return new int[]{i, m.get(target - nums[i])};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}