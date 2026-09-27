class Solution {
    public String makeGood(String s) {
        StringBuilder st=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
           if (st.length() > 0 &&
                Math.abs(st.charAt(st.length() - 1) - s.charAt(i)) == 32) {

                st.deleteCharAt(st.length() - 1);
            }
            else{
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}