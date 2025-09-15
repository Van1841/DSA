class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> vb = new HashMap<>();
        for(int i : nums){
            vb.put(i,vb.getOrDefault(i,0) + 1);
        }

        List<Integer> [] bucket = new ArrayList[nums.length +1];
        for(int i : vb.keySet()){
            int count = vb.get(i);
            if(bucket[count] == null) bucket[count] = new ArrayList<>();
            bucket[count].add(i);
        }

        int[] ans = new int[k];
        int idx = 0;
        for(int i = bucket.length-1; i >= 0 ; i--){
            if(bucket[i] != null){
                for(int j : bucket[i]){
                    ans[idx++] = j;
                    if(idx == k) return ans;
                }
            }
        }
        return ans;
    }
}