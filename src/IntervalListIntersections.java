import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        int i = 0, j = 0, k = 0;
        List<Interval> res = new ArrayList<>();
        while (i < A.length && j < B.length){
            int aStart = A[i].start;
            int aEnd = A[i].end;
            int bStart = B[j].start;
            int bEnd = B[j].end;

            if (aEnd < bEnd) i++;
            else j++;

            if (aStart <= bEnd && bStart <= aEnd){
                int[] temp = new int[]{aStart, aEnd, bStart, bEnd};
                Arrays.sort(temp);
                res.add(new Interval(temp[1], temp[2]));
            }
        }
        while (k < res.size() - 1){
            if (res.get(k).end == res.get(k + 1).start){
                int temp_start = res.get(k).start;
                res.remove(k);
                res.get(k).start = temp_start;
            }
            k++;
        }
        Interval[] result = new Interval[res.size()];
        return res.toArray(result);
    }
}
