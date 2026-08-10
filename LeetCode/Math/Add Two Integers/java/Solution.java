class Solution {
    public int sum(int num1, int num2) {
    int sum = 0;
    if( num1 == 0) return num2;
    else if( num2 == 0) return num1;
    else sum =num1 + num2;
        return sum;
    }
}