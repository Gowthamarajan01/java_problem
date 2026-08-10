class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set= new HashSet<>();
        for(int candy:candyType){
            set.add(candy);
        }
        int half=candyType.length/2;
        int unique=set.size();
        if(unique>=half){
            return half;
        }
        return unique;
    }
}