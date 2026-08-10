class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int n) {
        List<Boolean> list = new ArrayList<>();
        int max = -1;
        int m = arr.length;

        for(int i = 0;i<m;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0 ; i < m ;i++ ){
            list.add(arr[i]+n >= max);
        }
        return list;
    }
}