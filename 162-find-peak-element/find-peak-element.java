class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        // int i = 0;
        // for (i = 0; i < nums.length; i++){
        //     for (int j =0 ; j < i; j++){
        //         if (nums[i]>nums[j]){
        //             return i;
        //         }
        //     }
        // }
        // return i;