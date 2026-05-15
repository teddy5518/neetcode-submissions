class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap 
        // Time complexity: O(m*n)
        // Space complexity: O(m*n) output groups are counted
        HashMap<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26]; // a - z

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
