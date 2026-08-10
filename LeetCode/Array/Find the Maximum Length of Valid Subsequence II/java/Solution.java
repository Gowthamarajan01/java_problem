class Solution {
        public int maximumLength(int[] A, int k) {
        int res = 0;
        for (int v = 0; v < k; v++) {
            int[] dp = new int[k];
            for (int a : A) {
                dp[a % k] = dp[(v + k - a % k) % k] + 1;
                res = Math.max(res, dp[a % k]);
            }
        }
        return res;
    }
        
    
}