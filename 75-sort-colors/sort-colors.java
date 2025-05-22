class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);    --> one line code is enough ! But lets solve using pointers.

        int red = 0;
        int white = 0;
        int blue = nums.length - 1 ;// bc blue ekdm right side pr hoga usse decrement krte rhenge.

        while( white <= blue ){
            if(nums[white] == 0){       // no. is 0 which is red toh red se swap krwao.
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;

                white++;
                red++; 

            }else if( nums[white] == 1){    // no. is 1 which is white toh same hee rhko usse.
                white++;

            }else{
                int temp = nums[white];     // else blue se swap krwao.
                nums[white] = nums[blue];
                nums[blue] = temp;

                
                blue--;
            }
        }
    }
}