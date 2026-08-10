class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (result.indexOf(String.valueOf(c)) != -1)
                continue;
            while (result.length() > 0 &&
                   result.charAt(result.length() - 1) > c &&
                   s.indexOf(result.charAt(result.length() - 1), i) != -1) {
                result.deleteCharAt(result.length() - 1);
            }
            result.append(c);
        }
        return result.toString();
    }
}

