public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 2) return false;
        while (n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }

    public boolean isPowerOfThree2(int n){
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
