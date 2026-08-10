class Solution {
    public int findNthDigit(int n) {
        //if(n <= 9) return n;
        long i = 1;
        long s = 1; 
        long e = 9;
        while(n > i*e){
             n-=i*e;
            i++;
           s*= 10;
           e*= 10;
        }
         s += (n-1) / i;
        String str = String.valueOf(s);
        return str.charAt((int)((n - 1) % i))-'0';
    }
}