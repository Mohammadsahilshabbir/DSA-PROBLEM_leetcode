class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> ch=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            ch.add(sentence.charAt(i));
        }
        if(ch.size()==26) return true;
        return false;
    }
}