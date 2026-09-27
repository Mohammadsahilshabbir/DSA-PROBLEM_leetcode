class Solution {
    public String reverseParentheses(String s) {
        Stack<String> ans=new Stack<>();
        StringBuilder st=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans.push(st.toString());
                st.setLength(0);
            }
            else if(s.charAt(i)==')'){
                st.reverse();
                String prev=ans.pop();
                st.insert(0,prev);
            }
            else{
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}