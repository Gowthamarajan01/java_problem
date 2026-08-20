1class Solution {
2    public String getPermutation(int n, int k) {
3        List<Integer> list = new ArrayList<Integer>();
4        int fact = 1;
5        for(int i =1;i<=n;i++){
6            fact*=i;
7            list.add(i); 
8        }
9        k--;
10        fact/=n;
11        StringBuilder s = new StringBuilder();
12        for(int i=n-1;i>=1;i--){
13            int d = k/fact;
14            s.append(String.valueOf(list.get(d)));
15            list.remove(d);
16            k%=fact;
17            fact/=i;
18        }
19        s.append(String.valueOf(list.get(0)));
20        return s.toString();
21    }
22}