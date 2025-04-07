class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> ma = new HashMap<>();
        List<Integer> vb = new ArrayList<>();

        for(int i : nums){
            ma.put(i, ma.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : ma.entrySet()){
            if(entry.getValue() > nums.length /3){
                vb.add(entry.getKey());
            }
        }
        return vb;
    }
}