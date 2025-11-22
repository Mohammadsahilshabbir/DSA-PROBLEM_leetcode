class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op:operations){
        switch(op){
            case "+":
            int last=st.pop();
            int newtop=last+st.peek();
            st.push(last);
            st.push(newtop);
            break;
            case "C":
            st.pop();
            break;
            case "D":
            st.push(2*st.peek());
            break;
            default:
            st.push(Integer.parseInt(op));            
            }
        }
        int sum=0;
        for(int s:st){
            sum=sum+s;
        }
        return sum;
    }
}