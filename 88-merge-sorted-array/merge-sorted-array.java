class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // ans ko nums1 mei store krna hai bc uska len m+n hai.

        for(int i = 0; i < n; i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}