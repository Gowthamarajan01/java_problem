class Solution {
    public boolean checkIfPangram(String sentence) {
        // A pangram must have at least 26 letters
        if (sentence.length() < 26) return false;

        // Use a boolean array to mark letters seen
        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        // Check if all 26 letters are present
        for (boolean letter : seen) {
            if (!letter) return false;
        }

        return true;
    }
}