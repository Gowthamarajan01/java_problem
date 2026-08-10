class Solution {
    public String removeStars(String s) {
       Stack<Character>ans=new Stack<>();
       for(char c:s.toCharArray()){
           if(c =='*') ans.pop();
           else ans.push(c);     
       }
       StringBuilder sb=new StringBuilder();
       for(char c:ans)sb.append(c);
       return sb.toString();
    }
}