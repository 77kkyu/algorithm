class Solution {
    public int[] solution(long n) {
        String str = n+"";
        int size = str.length();
        int[] answer = new int[size];
        for (int i=0; i<size; i++) {
            answer[i] = Character.getNumericValue(str.charAt(size - 1 - i));
        }
        return answer;
    }
}