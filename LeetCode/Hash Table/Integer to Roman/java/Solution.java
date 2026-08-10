class Solution {
    public String intToRoman(int num) {
        int[] s1={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         String[]s2={"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
              StringBuilder sb=new StringBuilder();
              for(int i=0;i<s1.length;i++){
                if(num==0)
                break;
                while(num>=s1[i]){
                    sb.append(s2[i]);
                    num-=s1[i];
                }
              }  
              return sb.toString();  
    }
}