class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int strSize = my_string.length();
        answer = my_string.substring(strSize-n, strSize);
        return answer;
    }
}