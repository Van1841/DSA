class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Back Tracking -- > is used to explore all the cases and select the ones which meet the requirements.

        List<List<Integer>> res = new ArrayList<>();
        fn(candidates, target,0, new ArrayList<>(), 0 , res);
        return res;
    }
    private void fn (int[] candidates, int target, int index , List<Integer> comb , int total, List<List<Integer>> res){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total > target || index >= candidates.length){
            return;
        }
        comb.add(candidates[index]);
        fn(candidates, target , index, comb, total + candidates[index], res);
        comb.remove(comb.size() - 1);
        fn(candidates,target,index + 1 ,comb ,total, res);
    }
}