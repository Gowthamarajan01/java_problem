class Solution {
    public int[] getConcatenation(int[] nums) {
     int[] nums1= new int[nums.length];
      for(int i = 0;i<nums1.length;i++){
          nums1[i] = nums[i];
      } 
      int[]res = new int[nums.length+nums1.length]; 
   System.arraycopy(nums,0,res,0,nums.length);
   System.arraycopy(nums1,0,res,nums.length,nums1.length);
    return res;
    }
}