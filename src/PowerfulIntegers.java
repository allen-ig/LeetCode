import java.util.LinkedList;
import java.util.List;

public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        if (bound <= 1) return new LinkedList<>();
        List<Integer> first = new LinkedList<>();
        List<Integer> second = new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        int temp1 = 1;
        int temp2 = 1;
        if (x == 1) first.add(1);
        else{
            while (temp1 < bound){
                first.add(temp1);
                temp1 *= x;
            }
        }
        if (y == 1) second.add(1);
        else {
            while (temp2 < bound){
                second.add(temp2);
                temp2 *= y;
            }
        }
        for (Integer aFirst : first) {
            for (Integer aSecond : second) {
                int sum = aFirst + aSecond;
                if (sum <= bound && !res.contains(sum)) res.add(sum);
            }
        }
        return res;
    }
}
