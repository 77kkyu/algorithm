import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) { // true
                for (int j = 0; j < arr[i] * 2; j++) { // arr[i] * 2
                    list.add(arr[i]);
                }
            } else { // false
                for (int j = 0; j < arr[i]; j++) { // arr[i]값 만큼 마지막 제거
                    if (!list.isEmpty()) {
                        list.remove(list.size() - 1);  
                    }
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}