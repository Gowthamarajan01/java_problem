class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int row=mat.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j || i+j==row-1){
                    sum+=mat[i][j];
                }
            }
            
        }
        return sum;
    }
}