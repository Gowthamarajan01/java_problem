class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        long[] prefix = new long[n + 1];

        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stations[i];
        }

        
        long[] power = new long[n];
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n - 1, i + r);
            power[i] = prefix[right + 1] - prefix[left];
        }
        long low = 0, high = (long) 1e18, ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (canAchieve(power, n, r, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canAchieve(long[] power, int n, int r, long k, long target) {
        long[] added = new long[n];
        long used = 0, currAdd = 0;

        for (int i = 0; i < n; i++) {
            if (i - r - 1 >= 0) {
                currAdd -= added[i - r - 1];
            }

            long currPower = power[i] + currAdd;
            if (currPower < target) {
                long need = target - currPower;
                if (need > k - used) return false;

                used += need;
                currAdd += need;

                int addPos = Math.min(n - 1, i + r);
                added[addPos] += need;
            }
        }
        return true;
    }
}