class Solution {
    public int maxPoints(int[][] points) {
        int max1 = 0;
        for (int[] x : points) {
            Map<Double, Integer> mp = new HashMap<>();
            for (int[] y : points) {
                Double slope;
                if (x == y) {
                    continue;
                }
                if (x[0] == y[0]) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = (y[1] - x[1]) / (double) (y[0] - x[0]);
                }
                mp.put(slope, mp.getOrDefault(slope, 0) + 1);
                max1 = Math.max(max1, mp.get(slope));
            }
        }
        return max1 + 1;
    }
}