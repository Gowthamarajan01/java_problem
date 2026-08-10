class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // only lowercase letters
        
        // Count letters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Use letters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (--count[c - 'a'] < 0) {
                return false; // not enough of this letter
            }
        }
        
        return true;
    }
}