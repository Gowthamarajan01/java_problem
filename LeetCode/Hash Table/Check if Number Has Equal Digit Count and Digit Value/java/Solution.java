class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < n; i++) {
            if (count[i] != num.charAt(i) - '0') {
                return false;
            }
        }

        return true;
    }
}
