class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        if (size%2 == 0) {
            int a = size/2;
            answer += s.charAt(a-1);
            answer += s.charAt(a);
        }
        
        if (size%2 == 1) {
            answer += s.charAt(size/2);
        }
        return answer;
    }
}