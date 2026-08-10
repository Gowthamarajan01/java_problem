class Solution {
    public String makeGood(String s) {
        Stack<Character>ans=new Stack<>();
        for(char c:s.toCharArray()){
            //if(!ans.isEmpty()) ans.peek(c);
            if(!ans.isEmpty() && Math.abs(ans.peek() - c) == 32) ans.pop();
            else ans.push(c);
        }
        StringBuilder sb=new StringBuilder();   
        for(char c:ans) sb.append(c);
        return sb.toString();
    }
}