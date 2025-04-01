class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int size = s.length();
        int pCnt = 0;
        int yCnt = 0;
        for (int i=0; i<size; i++) {
            if (Character.toString(s.charAt(i)).toUpperCase().equals("P")) {
                pCnt++;
            }
            
            if (Character.toString(s.charAt(i)).toUpperCase().equals("Y")) {
                yCnt++;
            }
                
        }
        
        if (pCnt != yCnt) {
            answer = false;
        } 

        return answer;
    }
}