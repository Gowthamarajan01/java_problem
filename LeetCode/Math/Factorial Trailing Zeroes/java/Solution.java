class Solution {
    public int trailingZeroes(int n) {
      int fact = 1;
      int res = 0;
    //   for(int i = 1;i <= n;i++){
    //          fact*=i;
    //   }  
    //     res = fact %  5;
    //     return res;
    while(n>0){
        n /= 5;
        res+=n;
    }
    return res;
    }
}