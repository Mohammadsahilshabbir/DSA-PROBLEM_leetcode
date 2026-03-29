// class Solution {
//     public int addDigits(int num) {
//         int digit=0;
//         int sum=0;
//         for(int i=1;i<=num;i++){
//             digit=digit/10;
//             sum=sum+i;
//         }return sum;
//         for(int j=1;j<=sum;j++){
//             sum=sum/10;
//             sum=sum+j;
//         }
//     return sum;
//     }
// }

class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return (num % 9 == 0) ? 9 : (num % 9);
    }
}