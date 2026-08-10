class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        List <Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
            list.addAll(list);
            int arr[]=new int[list.size()];
            int ind=0;
            for(int i:list){
                 arr[ind++]=i;
            }
           return arr;
        
    }     
}