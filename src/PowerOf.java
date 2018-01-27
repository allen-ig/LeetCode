public class PowerOf {
    public double myPow(double x, int n){
        double res;
        if (n == -1) return 1 / x;
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0) return 1 / x * myPow(1 / x, -(n + 1));
        else {
            if (n % 2 == 0) {
                res = myPow(x * x, n / 2);
            } else {
                res = x * myPow(x * x, n / 2);
            }
        }
        return res;
    }
}
