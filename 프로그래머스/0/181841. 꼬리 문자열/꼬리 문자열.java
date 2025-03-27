import java.util.*;
class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        List<String> list = new LinkedList<>();
        for (String str : str_list) {
            if (!str.contains(ex)) {
                list.add(str);
            }
        }
        for (String str : list) {
            answer += str;
        }
        return answer;
    }
}