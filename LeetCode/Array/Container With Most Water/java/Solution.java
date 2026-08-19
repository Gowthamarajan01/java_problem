class Solution {
    public int maxArea(int[] height) {
           int l = 0;
           int r= height.length-1;
           int sum =0;
           while(l<r){
            int currSum = Math.min(height[l],height[r]) * (r-l);
            sum=Math.max(sum,currSum);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
           }
           return sum;
    }
}