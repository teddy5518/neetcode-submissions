class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        String sSorted = new String(sChar);
        String tSorted = new String(tChar);

        if (sSorted.matches(tSorted)) {
            return true;
        }

        return false;
    }
}
