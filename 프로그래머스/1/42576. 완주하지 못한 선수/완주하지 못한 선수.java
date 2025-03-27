import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        String answer = "";
        
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
       
        for(String player : participant){
        hashMap.put(player,hashMap.getOrDefault(player, 0)+1);
        }
        
        for(String finisher : completion){
            hashMap.put(finisher,hashMap.get(finisher)-1);
        }
       
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() != 0){
                answer = entry.getKey(); break;
            }
        }
        
        return answer;

    }
}