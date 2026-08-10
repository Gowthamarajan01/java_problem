class Solution {
    private boolean balance(int n){
        String s = Integer.toString(n);
        int[] freq = new int[10];
        for (char c : s.toCharArray()){
            freq[c - '0']++;
        }
        for (char c : s.toCharArray()){
            int digit = c - '0';
            if (freq[digit] != digit){
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        n++;
        while (!balance(n)){
            n++;
        }
        return n;
    }
}