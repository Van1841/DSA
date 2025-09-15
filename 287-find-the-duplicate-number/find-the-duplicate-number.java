class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> vb = new HashSet<>();
        for(int i : nums){
            if(!vb.contains(i)){
                vb.add(i);
            }else{
                return i;
            }
        }
        return 1;
    }
}