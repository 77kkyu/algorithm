import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> wordToDigit = new HashMap<>();
        wordToDigit.put("zero", "0");
        wordToDigit.put("one", "1");
        wordToDigit.put("two", "2");
        wordToDigit.put("three", "3");
        wordToDigit.put("four", "4");
        wordToDigit.put("five", "5");
        wordToDigit.put("six", "6");
        wordToDigit.put("seven", "7");
        wordToDigit.put("eight", "8");
        wordToDigit.put("nine", "9");

        for (Map.Entry<String, String> entry : wordToDigit.entrySet()) {
            s = s.replaceAll(entry.getKey(), entry.getValue());
        }
        return Integer.parseInt(s);
    }
}