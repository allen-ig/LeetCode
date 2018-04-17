public class UglyNumber {
    public boolean isUgly(int num) {
        boolean res = false;
        if (num == 1) return true;
        if (num == 0) return res;
        if (num % 2 == 0) res = isUgly(num / 2);
        if (num % 3 == 0) res = isUgly(num / 3);
        if (num % 5 == 0) res = isUgly(num / 5);
        return res;
    }
}
