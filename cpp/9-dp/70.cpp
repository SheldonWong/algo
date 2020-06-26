class Solution {
public:
    int climbStairs(int n) {
        if(n == 1){
            return n;
        }

        int p3, p1 = 1,p2 = 1;
        for(int i=2; i<=n; i++){
            p3 = p2 + p1;
            p1 = p2;
            p2 = p3;
        }
        return p3;
    }
};
