class Solution {
    public long maximumTotalDamage(int[] power) {
        // Count the occurrence of each damage value
        Map<Integer, Integer> count = new HashMap<>();
        for (int damage : power) {
            count.merge(damage, 1, Integer::sum);
        }
        // Gather unique damage values and sort
        List<Integer> uniqueDamages = new ArrayList<>(count.keySet());
        Collections.sort(uniqueDamages);

        int n = uniqueDamages.size();
        long[][] dp = new long[n][2];
        for (int i = 0; i < n; ++i) {
            int damage = uniqueDamages.get(i);
            long sum = (long) damage * count.get(damage);

            if (i == 0) {
                dp[i][0] = 0;          // Not picking this damage value
                dp[i][1] = sum;        // Picking it
            } else {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
                dp[i][1] = sum;

                // Check if last damage is blocked
                if (uniqueDamages.get(i - 1) != damage - 1 && uniqueDamages.get(i - 1) != damage - 2) {
                    dp[i][1] += Math.max(dp[i - 1][0], dp[i - 1][1]);
                } else if (i >= 2 && uniqueDamages.get(i - 2) != damage - 2) {
                    dp[i][1] += Math.max(dp[i - 2][0], dp[i - 2][1]);
                } else if (i >= 3) {
                    dp[i][1] += Math.max(dp[i - 3][0], dp[i - 3][1]);
                }
            }
        }
        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }
}
