import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //첫번째 부터 두번째 값으로 자르기
        //세번째 값으로 정렬한 데이터 가져오기
        //answer에 담아주기
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
            int[] tmps = 
                Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(tmps);
            answer[i] = tmps[commands[i][2]-1];
        }
        return answer;
    }
}