class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character>ans=new HashSet<>();
        
        int n=s.length();
        for(int i=0;i<n;i++){
            ans.add(s.charAt(i));
        }
        return ans.size();
    }
}