class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set <String> set= new HashSet<>();
                Set <String> set1= new HashSet<>();
                for(int i=0;i<=s.length()-10;i++){
                    String Str=s.substring(i,i+10);
                    if(!set.add(Str)) set1.add(Str);
                }
               return new ArrayList<>(set1);
             
    }
}