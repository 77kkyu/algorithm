import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int size = A.length;
        
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[size - 1 - i]; // B는 뒤에서부터 꺼냄
        }

        return answer;
    }
}