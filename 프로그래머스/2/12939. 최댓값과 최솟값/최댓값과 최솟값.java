class Solution {
    public String solution(String s) {
        // 문자열을 공백으로 분리하여 숫자 배열로 변환
        String[] numbers = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return min + " " + max;
    }
}