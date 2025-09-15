class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        if(n == 1){
            ans.add(nums[0]);
            return ans;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        int sol = n / 3;
        for(int i : map.keySet()){
            if(map.get(i) > sol){
                ans.add(i);
            }
        }

        return ans;
    }
}