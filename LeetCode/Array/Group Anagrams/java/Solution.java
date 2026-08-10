class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[]c = s.toCharArray();
            Arrays.sort(c);
            String s1 = String.valueOf(c);
           if(!mp.containsKey(s1)){
            mp.put(s1,new ArrayList<>());
           }
           mp.get(s1).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
