class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact*=i;
            list.add(i); 
        }
        k--;
        fact/=n;
        StringBuilder s = new StringBuilder();
        for(int i=n-1;i>=1;i--){
            int d = k/fact;
            s.append(String.valueOf(list.get(d)));
            list.remove(d);
            k%=fact;
            fact/=i;
        }
        s.append(String.valueOf(list.get(0)));
        return s.toString();
    }
}