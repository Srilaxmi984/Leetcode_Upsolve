class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;

        // Step 1: Compute total decoded length
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                size++;
            } else {
                size *= (ch - '0');
            }
        }

        // Step 2: Traverse backwards to find k-th character
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            k %= size;

            if (Character.isLetter(ch)) {
                if (k == 0) {
                    return String.valueOf(ch);
                }
                size--;
            } else {
                size /= (ch - '0');
            }
        }

        return "";
    }
}
