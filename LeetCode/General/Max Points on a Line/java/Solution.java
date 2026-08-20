1class Solution {
2    public int maxPoints(int[][] points) {
3        int max1 = 0;
4        for (int[] x : points) {
5            Map<Double, Integer> mp = new HashMap<>();
6            for (int[] y : points) {
7                Double slope;
8                if (x == y) {
9                    continue;
10                }
11                if (x[0] == y[0]) {
12                    slope = Double.POSITIVE_INFINITY;
13                } else {
14                    slope = (y[1] - x[1]) / (double) (y[0] - x[0]);
15                }
16                mp.put(slope, mp.getOrDefault(slope, 0) + 1);
17                max1 = Math.max(max1, mp.get(slope));
18            }
19        }
20        return max1 + 1;
21    }
22}