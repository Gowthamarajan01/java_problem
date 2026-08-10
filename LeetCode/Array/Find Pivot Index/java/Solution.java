class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
       int tot = 0;
       for(int n1 : nums){
              tot+=n1;
       }
       int l = 0;
       for(int i = 0;i<n;i++){
        int r = tot - l -nums[i];
        if(l == r)
        return i;
         l += nums[i];
        
       }
       return -1;
    }
}