class Solution {
    public int[] solution(int[] num_list, int n) {
        int index = n - 1;
        int[] answer = new int[num_list.length - (index)];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[index + i];
        }
        
        return answer;
    }
}