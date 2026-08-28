class Solution {
    public List<String> letterCombinations(String arr) {
          List<String>res= new ArrayList<>();
        if(arr.length()==0) return res;
        String[] keypads = {"","","abc",   "def",  "ghi", "jkl",  "mno",   "pqrs","tuv","wxyz" };
      res.add("");
      for(int i = 0;i<arr.length();i++){
        char c = arr.charAt(i);
        String l = keypads[c - '0'];
         List<String> list = new ArrayList<>();
        for(String combination : res){
            for(char m : l.toCharArray()){
                list.add(combination+m);
            }
        }
        res = list;
      }
      return res;
    }
}