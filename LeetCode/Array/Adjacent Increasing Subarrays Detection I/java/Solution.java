class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k==1) return true;
        int size=1;
        for(int i=1,j=k+1;j<nums.size();i++,j++){
            if(nums.get(i)>nums.get(i-1) && nums.get(j)>nums.get(j-1)){
                size++;
            }
            else{
                size=1;
            }
            if(size==k)
            return true;
        }
        return false;
    }
}