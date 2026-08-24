class Solution {

    public boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();
        int count1 = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isUpperCase(c[i]))
                count1++;
        }
        if (count1 == c.length)
            return true;
        if (count1 == 0)
            return true;
        if (count1 == 1 && Character.isUpperCase(c[0]))
            return true;
        return false;
    }
}