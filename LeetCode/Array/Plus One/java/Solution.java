class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // increment and done
                return digits;
            }
            digits[i] = 0; // set to 0 and carry over
        }

        // If all digits were 9, create new array with extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1; // the rest are 0 by default
        return result;
    }
}
