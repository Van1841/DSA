public class Solution {
    public int numRabbits(int[] answers) {
        if (answers == null || answers.length == 0) return 0;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int a : answers) freq.put(a, freq.getOrDefault(a, 0) + 1);

        int total = 0;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            int x = e.getKey();          // reported number of other rabbits
            int count = e.getValue();    // how many gave this answer
            int groupSize = x + 1;

            // number of groups needed (ceiling division)
            int groups = (count + groupSize - 1) / groupSize;

            total += groups * groupSize;
        }
        return total;
    }
}