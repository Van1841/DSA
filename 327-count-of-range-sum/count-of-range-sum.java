class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        long[] sums = new long[n + 1];
        for (int i = 0; i < n; i++) sums[i + 1] = sums[i] + nums[i];
        return (int) countWhileMergeSort(sums, 0, n, lower, upper);
    }

    private long countWhileMergeSort(long[] sums, int left, int right, int lower, int upper) {
        if (left >= right) return 0;
        int mid = (left + right) / 2;
        long count = countWhileMergeSort(sums, left, mid, lower, upper)
                   + countWhileMergeSort(sums, mid + 1, right, lower, upper);

        int j = mid + 1, k = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (k <= right && sums[k] - sums[i] < lower) k++;
            while (j <= right && sums[j] - sums[i] <= upper) j++;
            count += j - k;
        }

        // merge two sorted halves
        long[] temp = new long[right - left + 1];
        int p = left, q = mid + 1, t = 0;
        while (p <= mid && q <= right) {
            if (sums[p] <= sums[q]) temp[t++] = sums[p++]; else temp[t++] = sums[q++];
        }
        while (p <= mid) temp[t++] = sums[p++];
        while (q <= right) temp[t++] = sums[q++];
        System.arraycopy(temp, 0, sums, left, temp.length);

        return count;
    }
}