class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];

            // 더 큰 쪽을 가로로, 작은 쪽을 세로로 돌려서 맞춤
            int longer = Math.max(w, h);
            int shorter = Math.min(w, h);

            // 큰 수를 남김
            maxWidth = Math.max(maxWidth, longer);
            maxHeight = Math.max(maxHeight, shorter);
        }
        answer = maxWidth * maxHeight;
        return answer;
    }
}