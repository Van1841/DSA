class Solution {
    public void rotate(int[] nums, int d) {
        int n = nums.length;
        d %= n; // rotate the nos, remainder times !

        reverse(nums, 0, n-1);
        reverse(nums, 0, d-1);
        reverse(nums, d, n-1);

    }
    public void reverse(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}