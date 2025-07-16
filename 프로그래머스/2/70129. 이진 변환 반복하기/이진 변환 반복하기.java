class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int convertCount = 0;

        while (!s.equals("1")) {
            int originalLength = s.length();
            s = s.replace("0", ""); // 0 제거
            zeroCount += (originalLength - s.length()); 
            int c = s.length(); // 1의 개수
            s = Integer.toBinaryString(c); // 길이를 2진수로 변환
            convertCount++;
        }
        
        answer[0] = convertCount;
        answer[1] = zeroCount;

        return answer;
    }
}