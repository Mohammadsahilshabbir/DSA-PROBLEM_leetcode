class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max_leng=0;
        List<Character> ans=new ArrayList<>();
        while(end!=s.length()){
            if(!ans.contains(s.charAt(end))){
                ans.add(s.charAt(end));
                end++;
                max_leng=Math.max(ans.size(),max_leng);
            }
            else{
                ans.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_leng;
    }
}