class Solution {
    public int findNonMinOrMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int res = -1;

        for(int i : nums)
        {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

      
        for(int i : nums)
        {
            if(i!=min && i!=max)
            {
                res = i;
            }
        }


        return res;


    }
}