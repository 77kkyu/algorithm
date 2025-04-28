import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        // 각 문자에 대해 가장 마지막에 나온 인덱스를 기록
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (lastIndexMap.containsKey(c)) {
                answer[i] = i - lastIndexMap.get(c);
            } else {
                answer[i] = -1;
            }

            // 현재 문자의 위치 갱신
            lastIndexMap.put(c, i);
        }

        return answer;
    }
}