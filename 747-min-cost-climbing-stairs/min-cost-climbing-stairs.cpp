class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int n=cost.size();
        vector<int> dp(n+1,-1);
        
        return min(helper(cost,0,dp),helper(cost,1,dp));
    }
    int helper(vector<int>& cost,int i,vector<int>&dp){
        if(i>=cost.size()) return 0;
        if(dp[i]!=-1) return dp[i];
        int ekjump=cost[i]+helper(cost,i+1,dp);
        int dojump=cost[i]+helper(cost,i+2,dp);
        return dp[i]=min(ekjump,dojump);
    }
};