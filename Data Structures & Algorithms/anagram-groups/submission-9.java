class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create HashMap
        HashMap<String, List<String>> ans = new HashMap<>();
        // iterate strs
        for (String s : strs) {
            // count frequency of the alphabet that value of strs has
            int[] count = new int[26]; // a - z

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        // return the values
        return new ArrayList<>(ans.values());
    }
}
