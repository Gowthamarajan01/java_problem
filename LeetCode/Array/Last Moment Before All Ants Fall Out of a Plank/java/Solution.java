class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft = 0;
        for(int x : left) {
            maxLeft=Math.max(maxLeft, x);
        }
        int minRight = n;
        for(int x : right) {
            minRight=Math.min(minRight, x);
        }
        return Math.max(maxLeft, n - minRight);
    }
}