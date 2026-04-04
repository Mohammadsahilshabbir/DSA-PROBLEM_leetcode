class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String s : sentences) {
            int count = s.split(" ").length;
            maxWords = Math.max(maxWords, count);
        }
        return maxWords;
    }
}