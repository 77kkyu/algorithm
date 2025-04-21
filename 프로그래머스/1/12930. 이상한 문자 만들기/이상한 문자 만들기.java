class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sp = s.split(" ", -1); // 공백 유지

        for (int i=0; i<sp.length; i++) {
            for (int j=0; j<sp[i].length(); j++) {
                char c = sp[i].charAt(j);
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
            if (i != sp.length - 1) {
                answer.append(" "); // 마지막엔 공백 추가 안 함
            }
        }
        
        return answer.toString();
    }
}