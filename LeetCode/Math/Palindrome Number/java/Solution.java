class Solution {
    public boolean isPalindrome(int x) {
        while(x<0){
            return false;
        }
        int sum=0;
        int org=x;
        while(x!=0){
           int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(org==sum){
            return true;
        }
        else{
            return false;
        }
    }
}