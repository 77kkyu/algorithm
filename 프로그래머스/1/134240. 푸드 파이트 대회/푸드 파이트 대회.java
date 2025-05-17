class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        // 음식 번호는 1번부터 시작하므로 food[0]은 물(0번 음식)로 무시
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; // 두 선수가 동일하게 먹을 수 있는 양, 양쪽에서 먹어야하기 때문에 나머지가 홀수인 경우 나눌 수 없음
            left.append(String.valueOf(i).repeat(count)); // 왼쪽 선수용 음식, repeat으로 문자열 반복
        }

        StringBuilder answer = new StringBuilder();
        answer.append(left); // 왼쪽 선수 음식
        answer.append("0");  // 중앙의 물
        answer.append(left.reverse()); // 오른쪽 선수 음식 (좌우 대칭)

        return answer.toString();
    }
}