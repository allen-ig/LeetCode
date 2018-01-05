import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if (isNumDivisible(i)){
                res.add(i);
            }
        }
        return res;
    }

    private boolean isNumDivisible(int num){
        if (num == 0) return false;
        int t = num;
        int digit;
        while(t != 0){
            digit = t % 10;
            if (digit == 0) return false;
            if (num % digit != 0) return false;
            t /= 10;
        }
        return true;
    }
}
