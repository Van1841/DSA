class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            hash.add(i);
        }
        int longest = 0;
        for(int i : hash){
            if(!hash.contains(i-1)){
                int len = 1;

                while(hash.contains(i+len) == true){
                    len++;
                }

                longest = Math.max(longest , len);
            }
        }
        return longest;
    }
}