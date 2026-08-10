class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max1 = Integer.MIN_VALUE;
        for(int i  =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                sum = (nums[i]-1)*(nums[j]-1);
                max1 = Math.max(sum,max1);
            }
        }
        return max1;
    }
}