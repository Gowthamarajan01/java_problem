class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (hs.contains(i + "r" + board[i][j]) || hs.contains(j + "c" + board[i][j])
                        || hs.contains(i / 3 + "r" + j / 3 + "c" + board[i][j])) {
                    return false;
                }
                hs.add(i + "r" + board[i][j]);
                hs.add(j + "c" + board[i][j]);
                hs.add(i / 3 + "r" + j / 3 + "c" + board[i][j]);

            }
        }
return true;
    }
}