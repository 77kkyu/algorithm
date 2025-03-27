import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> deleteList = new ArrayList<>();
        for (int num : delete_list) {
            deleteList.add(num);
        }
        
        List<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (!deleteList.contains(num)) {
                resultList.add(num);
            }
        }
        
        int resultSize = resultList.size();
        int[] answer = new int[resultSize];
        for (int i = 0; i < resultSize; i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}