class Solution {
    public int lengthOfLastWord(String s) {
       /* int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && ans>0)
            break;
            else if(s.charAt(i)!=' ')
            ans++;
        }
        return ans;*/
        String[] arr = s.trim().split(" ");
        return arr[arr.length-1].length();
    }
}