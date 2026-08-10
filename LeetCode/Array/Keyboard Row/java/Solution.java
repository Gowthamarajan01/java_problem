class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        int ind=0;
        for(String s:words){
            boolean ans=true;
            for(char c :s.toCharArray()){
                if(s1.indexOf(c)==-1){
                    ans=false;
                }
            }
            if(ans){
                words[ind++] = s;
                continue;
            }
            ans = true;
            for(char c:s.toCharArray()){
                   if(s2.indexOf(c)==-1){
                    ans=false;
                   }
            }
               if(ans){
                words[ind++] = s;
                continue;
            }
            ans=true;
             for(char c:s.toCharArray()){
                   if(s3.indexOf(c)==-1){
                    ans=false;
                   }
            }
             if(ans){
                words[ind++] = s;
            
            }
        }
        return Arrays.copyOf(words,ind);
    }
}