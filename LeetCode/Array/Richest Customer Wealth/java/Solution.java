class Solution {
    public int maximumWealth(int[][] accounts) {
     int max=0;
     for(int[] customer: accounts){
        int x=0;
        for(int sum : customer){
        x+=sum;
        }
        if(x>max){
            max=x;
        }
     }    
     return max;
    }
}