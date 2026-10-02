class Solution {
public:
    int maxProduct(int n) {
        vector<int> ans;

        while(n > 0) {
            int digit = n % 10;
            n = n / 10;
            ans.push_back(digit);
        }
        // pehle saare digits ko array;list mai add krna ok 
        // arraylist mai traverse krke 1st nad sec max nikalke multiply krdena 
        int max = INT_MIN;
        int secmax = INT_MIN;

        for(int i = 0; i < ans.size(); i++) {
            if(ans[i] > max) {
                int temp = max;
                max = ans[i];
                secmax = temp;
            }
            else if(ans[i] > secmax) {
                secmax = ans[i];
            }
        }

        return max * secmax;
    }
};