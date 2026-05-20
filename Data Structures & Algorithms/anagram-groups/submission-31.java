class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap
        // Time Complexity: O(n*m)
        // Space Complexity: O(n*m)
        HashMap<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26]; // a - z

            for (char c : s.toCharArray()) {
                count[c - 'a']++; // act -> a1b0c1...t1
            }

            String key = Arrays.toString(count);

            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
