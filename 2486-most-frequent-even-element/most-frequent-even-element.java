class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if( i % 2 == 0) map.put(i,map.getOrDefault(i,0) + 1);
        }

        int ans = -1;
        int maxFreq = 0;
        
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(freq > maxFreq || (freq == maxFreq && i < ans)){
                maxFreq = freq;
                ans = i;
            }
        }
        return ans;
    }
}