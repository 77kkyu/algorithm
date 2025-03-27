import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n%2 == 0) {
            int sum = 0;
            for (int i = 2; i <= n; i += 2) {
                sum += i * i;
            }
            answer = sum;
        } else if (n%2 ==1) {
            int sum = 0;
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            answer = sum;
        }
        
        return answer;
    }
}