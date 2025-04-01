class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] chars = String.valueOf(x).toCharArray();
        int sum = 0;
        for (char ch : chars) {
            sum += Integer.parseInt(Character.toString(ch));
        }
        
        if (x%sum != 0) {
            answer = false;
        }
        return answer;
    }
}