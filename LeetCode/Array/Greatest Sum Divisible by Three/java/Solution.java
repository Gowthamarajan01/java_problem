class Solution {
    public int maxSumDivThree(int[] nums) {

        
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int num : nums) {
            int[] temp = dp.clone();

            for (int r = 0; r < 3; r++) {

                if (dp[r] != Integer.MIN_VALUE) {

                    int newSum = dp[r] + num;   
                    int newR = newSum % 3;      

                    temp[newR] = Math.max(temp[newR], newSum);
                }
            }

            dp = temp; 
        }

        return dp[0]; 
    }
}