import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean isStart = true;  // 단어의 첫 문자 여부

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                isStart = true;  // 다음 문자는 단어의 시작
            } else {
                if (isStart) {
                    result.append(Character.toUpperCase(c));
                    isStart = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }

        return result.toString();
    }
}