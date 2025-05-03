class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                result.append(' '); // 공백은 그대로
            } else if (c >= 'A' && c <= 'Z') {
                // 대문자
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                result.append(shifted);
            } else if (c >= 'a' && c <= 'z') {
                // 소문자
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                result.append(shifted);
            }
        }

        return result.toString();
    }
}