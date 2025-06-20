class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List <List <Integer>> vb = new ArrayList<>();

        if(nums.length == 1){
            List<Integer> single = new ArrayList<>();
            single.add(nums[0]);
            vb.add(single);
        }

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int [] remains = new int[nums.length-1];
            int index = 0;

            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    remains[index]=nums[j];
                    index ++;
                }
            }
            List<List<Integer>> ans = permute(remains);
            for(List<Integer> p : ans){
                p.add(n);
            }
            vb.addAll(ans);
        }
        return vb;
    }
}