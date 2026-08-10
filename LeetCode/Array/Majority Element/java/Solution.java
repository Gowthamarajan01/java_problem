class Solution {
    public int majorityElement(int[] nums) {
    // Arrays.sort(nums);
    // return nums[nums.length/2];
    Map<Integer,Integer> map = new HashMap<>();
    for(int i :nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(int n : map.keySet()){
        if(map.get(n) > nums.length/2){
            return n;
        }
    }
    return -1;
    }
}