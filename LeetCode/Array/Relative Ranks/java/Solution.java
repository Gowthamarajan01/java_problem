import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] answer = new String[n];
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = score[i];
        }
        Arrays.sort(copy);
        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = n - 1; j >= 0; j--) {
                if (score[i] == copy[j]) {
                    break;
                }
                rank++;
            }
            if (rank == 1) {
                answer[i] = "Gold Medal";
            } else if (rank == 2) {
                answer[i] = "Silver Medal";
            } else if (rank == 3) {
                answer[i] = "Bronze Medal";
            } else {
                answer[i] = String.valueOf(rank);
            }
        }

        return answer;
    }
}
