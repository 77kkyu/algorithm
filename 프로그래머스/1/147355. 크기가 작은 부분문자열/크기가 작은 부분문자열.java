class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int index = p.length();
        for (int i=0; i<t.length(); i++) {
            if (i == t.length()-(index-1)) {
                break;
            }
            
            String str = t.substring(i, (index)+i);
            if (Long.parseLong(p) >= Long.parseLong(str)) {
                answer++;
            }
        }
        return answer;
    }
}