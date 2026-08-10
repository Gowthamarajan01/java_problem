class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String opn:operations){
            if(opn.equals("X++") || opn.equals("++X")){
                x++;
            }
            else
            x--;
        }
        return x;
    }
}