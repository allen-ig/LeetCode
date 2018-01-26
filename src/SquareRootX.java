public class SquareRootX {
    public int mySqrt(int x) {
        if (x == 1) return x;
        int low = 0;
        int high = x;
        int mid = 0;
        while (low < high){
            mid = (low + high) / 2;
            if (mid * mid == x || high - low == 1) return mid;
            else if(x / mid < mid) high = mid;
            else low = mid;
        }
        return mid;
    }
}
