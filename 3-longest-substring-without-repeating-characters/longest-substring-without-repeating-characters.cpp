class Solution {
public:
    int lengthOfLongestSubstring(string s) {

     int start = 0;
     int end = 0;
     int max_length = 0;
     
     vector<char> ans;

     while(end!=s.length()){
        
        if (find(ans.begin(), ans.end(), s[end]) == ans.end()) {
            ans.push_back(s[end]);
            end++;
            max_length = max((int)ans.size(), max_length);
            
        }else{
            ans.erase(find(ans.begin(),ans.end(),s[start]));
            start++;
            
        }
     }
        return max_length;
        
     }
        
};