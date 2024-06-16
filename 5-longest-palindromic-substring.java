class Solution {
    public String longestPalindrome(String s) {
        String longest = s.length() == 1 ? s : ""; 
        for (int start = 0; start < s.length() - 1; start++) {
            for (int end = start + 1; end < s.length() + 1; end++) { 
                if (isPalindrome(s.substring(start, end)) && (end - start > longest.length())) {
                    longest = s.substring(start, end);
                }
            }
        }
        return longest;
    }
    public boolean isPalindrome(String s) {
        int current = 0;
        int end = s.length() - 1;
        while (current < end) {
            if (s.charAt(current) != s.charAt(end)) {
                return false;
            }
            current++;
            end--;
        }
        return true;
    }
}
