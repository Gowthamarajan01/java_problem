1class Solution {
2    public int maxArea(int[] height) {
3           int l = 0;
4           int r= height.length-1;
5           int sum =0;
6           while(l<r){
7            int currSum = Math.min(height[l],height[r]) * (r-l);
8            sum=Math.max(sum,currSum);
9            if(height[l] < height[r]){
10                l++;
11            }
12            else{
13                r--;
14            }
15           }
16           return sum;
17    }
18}