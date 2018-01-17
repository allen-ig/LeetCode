public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        return isPowerOfTwo(num) && Math.sqrt(num) % 1 == 0;
    }
    private boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0);
    }
}
