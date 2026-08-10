class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1;i <=n/2;i++){
            if(n%i==0){
               String d = s.substring(0,i);
               StringBuilder r = new StringBuilder();
               for(int j = 0;j<n/i;j++){
                r.append(d);
               }
               if(r.toString().equals(s)) return true;
            }
        }
        // String d =s+s;
        // String s1= d.substring(1,d.length()-1);
        // return d.contains(s1);
        return false;
        
    }
}