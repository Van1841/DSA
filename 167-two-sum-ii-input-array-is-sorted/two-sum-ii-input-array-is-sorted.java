class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(ans.containsKey(target - numbers[i])){
                return (new int[]{ ans.get(target - numbers[i])+1 , i +1});
            }
            ans.put(numbers[i],i);
        }
        return new int[]{}; 
    }
}