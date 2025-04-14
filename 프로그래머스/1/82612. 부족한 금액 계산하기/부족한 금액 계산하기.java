class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        long total = 0;
        for (int i=1; i<=count; i++) {
            total += i*price;
        }
        
        answer = total - answer;
        if (answer < 0) {
            answer = 0;
        }

        return answer;
    }
}