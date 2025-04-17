class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = toTernary(n);
        String reversed = new StringBuilder(str).reverse().toString();
        answer = Integer.parseInt(reversed, 3); // 10진법
        return answer;
    }
    
    public static String toTernary(int n) { // 3진법
        if (n == 0) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        while (n>0) {
            sb.append(n%3);
            n/=3;
        }
        return sb.reverse().toString();
    } 
    
}