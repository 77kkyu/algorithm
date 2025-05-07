import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> integers = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                integers.add(numbers[i] + numbers[j]);
            }
        }
        // System.out.println(integers);
        int[] result = integers.stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
        
        return result;
    }
}