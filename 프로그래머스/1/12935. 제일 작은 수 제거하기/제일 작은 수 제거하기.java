import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1}; // 배열에 원소가 하나면 -1 반환
        }

        // 최소값 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 최소값을 제외한 새로운 배열 만들기
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}