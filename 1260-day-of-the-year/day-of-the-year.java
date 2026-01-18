class Solution {
    static boolean isLeap(int year) {
        if(year%400==0) return true;
        if(year%100==0) return false;
        return (year%4==0) ;
        
    }
    public int dayOfYear(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int totalDays = day;

        for (int i = 0; i < month - 1; i++) {
            totalDays += days[i];
        }
        boolean leap=isLeap(year);
        
        if (leap && month > 2) {
            totalDays++;
        }

        return totalDays;
    }
}
