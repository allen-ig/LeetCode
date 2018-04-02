public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int minus1 = 2;
        int minus2 = 1;
        int res = 0;
        for (int i = 2; i < n; i++){
            res = minus1 + minus2;
            minus2 = minus1;
            minus1 = res;
        }
        return res;
    }
}
