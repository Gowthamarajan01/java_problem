class Solution {
    public int thirdMax(int[] nums) {
     Arrays.sort(nums);
     int distinctcount=1;
     int max=nums[nums.length-1];   
     for(int i=nums.length-2;i>=0;i--){
        if(nums[i]!=nums[i+1])
            distinctcount++;
            if(distinctcount==3)
                return nums[i];      
     }
    return max;
}
public static void main(String[]args){
    Solution s=new Solution();
    int[] nums1={3,2,1};
    int[] nums2={1,2};
    int[] nums3={2,2,3,1};
    System.out.println(s.thirdMax(nums1));
    System.out.println(s.thirdMax(nums2));
     System.out.println(s.thirdMax(nums3));
}
}