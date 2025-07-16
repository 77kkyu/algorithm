class Solution {
    public int solution(int n) {
        int count = 0;
        int start = 1, end = 1, sum = 1;
        while (start <= n / 2) {
            if (sum < n) {
                sum += ++end;
            } else if (sum > n) {
                sum -= start++;
            } else {
                count++;
                sum -= start++;
            }
        }
        return count+1; // 자기 자신 하나
    }
}