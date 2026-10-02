class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        while(n>0){
            int digit=n%10;
            n=n/10;
            ans.add(digit);
        }
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>max){
                int temp=max;
                max=ans.get(i);
                secmax=temp;
            }
            else if(ans.get(i)>secmax){
                secmax=ans.get(i);
            }
        }
        return max*secmax;
    }
}