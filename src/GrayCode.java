import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < Math.pow(2, n); i++) res.add(i ^ i / 2);
        return res;
    }
}
