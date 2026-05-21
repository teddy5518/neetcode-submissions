class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString().equals(answer.reverse().toString());
    }
}
