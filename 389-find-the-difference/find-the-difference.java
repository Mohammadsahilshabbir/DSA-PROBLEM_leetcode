class Solution {
    public char findTheDifference(String s, String t) {
        char[] carr1=s.toCharArray();
        char[] carr2=t.toCharArray();

        Arrays.sort(carr1);
        Arrays.sort(carr2);
       for(int i=0;i<carr1.length;i++){
        if(carr1[i]!=carr2[i]) {
            if(carr1.length<carr2.length) return carr2[i];
            else{

            return carr1[i];
            }
        }
       }
       return carr2[carr2.length-1];
    }
}