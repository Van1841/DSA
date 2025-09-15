class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans[] = new int[2];
        for(int i : map.keySet()){
            if(map.get(i) == 2){
                ans[0] = i;
            }
        }
        for(int i = 0; i <= nums.length; i++){
            if(!map.containsKey(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}