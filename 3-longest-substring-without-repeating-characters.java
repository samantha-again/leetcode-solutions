class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = s.length() == 1? 1 : 0;
        for (int i = 0; i < s.length() - 1; i++) {
            Set<Character> stringSet = new HashSet<Character>();
            stringSet.add(s.charAt(i));
            int current = 1;
            int j = i+1;
            while ((j < s.length()) && (!stringSet.contains(s.charAt(j))))  {
                current++;
                stringSet.add(s.charAt(j));
                j++;
            }
            if (current > longest) {
                longest = current;
                current = 0;
            } 
        }
        return longest;
    }
}
