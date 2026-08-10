class Solution {
    public String simplifyPath(String path) {
      Stack<String> stack= new Stack<>();
      String arr[] = path.split("/");
      for(String s:arr){
        if(s.isEmpty() || s.equals(".")) continue;
        if(!stack.isEmpty() && s.equals("..")) stack.pop();
        else if(s.equals("..")) continue;
        else stack.push(s);
      }  
      if(stack.isEmpty()) return "/";
      StringBuilder sb=new StringBuilder();
      for(String s:stack){
        sb.append("/").append(s);
      }
      return sb.toString();
    }
}