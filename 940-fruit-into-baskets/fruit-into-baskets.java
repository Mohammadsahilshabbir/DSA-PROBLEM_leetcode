class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
       
        int max=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(fruits[right], right);
            while(map.size()>2){
                map.remove(fruits[l], l);
                l++;
            }
            max=Math.max(max, right-l+1);
        }

        return max;
    }
}