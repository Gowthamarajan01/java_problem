class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int min  =prices[0];
       int max1= 0;
       for(int i =0;i<n;i++){
        if(prices[i]<min){
           min = prices[i] ;
        }
    else{
    int pro = prices[i]-min;
     max1 = Math.max(pro,max1);
    }
       } 
       return max1;
    }
}