class Solution {
    public long solution(long n) {
        long answer = (long) Math.sqrt(n);
        if (answer * answer == n) {
            answer = answer + 1;
            return answer * answer;
        } else {
            return -1;
        }
    }
}