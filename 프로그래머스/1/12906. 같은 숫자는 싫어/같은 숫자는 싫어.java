import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> integers = new ArrayList<>();
        int tmpNum = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != tmpNum) {
                integers.add(arr[i]);
                tmpNum = arr[i];
            }
        }
        
        answer = new int[integers.size()];
        for(int i=0; i<integers.size(); i++) {
            answer[i] = integers.get(i);
        }
        return answer;
    }
}