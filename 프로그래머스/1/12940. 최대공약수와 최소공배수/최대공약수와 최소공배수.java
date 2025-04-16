class Solution {
    public int[] solution(int n, int m) {
        int size = 2;
        int[] answer = new int[size];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
    
    public static int gcd(int n, int m) { // 최대공약수 
        while (m != 0) {
            int tem = m;
            m = n%m;
            n = tem;
        }
        return n;
    }
    
    public static int lcm(int n, int m) { // 최대공배수
        return n*m/gcd(n, m);
    }
}