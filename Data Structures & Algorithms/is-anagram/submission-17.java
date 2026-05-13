class Solution {
    public boolean isAnagram(String s, String t) {
        // Sorting Approach
        // Time complexity: O(n log n + m log m)
        // Space complexity: O(1)

        // compare length of the s and t
        // convert s and t into char array
        // compare the arrays

        // Fail early
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);

    }
}
