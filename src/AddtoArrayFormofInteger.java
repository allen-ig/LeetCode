import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int n = A.length;
        int cur = K;
        int i = n;
        while (--i >= 0 || cur > 0){
            if (i >= 0) cur += A[i];
            res.add(cur % 10);
            cur /= 10;
        }
        Collections.reverse(res);
        return res;
    }
}
