class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hash= new HashSet<>();
        for(int i : candyType){
            hash.add(i);
        }
        int ans = candyType.length / 2;

        if(hash.size() <= ans){
            return hash.size();
        }
        return ans;
    }
}