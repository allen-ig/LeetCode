import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    /**
     * time: O(n^2)
     * space: O(n)
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex){
        List<Integer> res = new ArrayList<>();
        if (rowIndex < 0) return res;
        if (rowIndex < 2) {
            res.add(1);
            if (rowIndex == 0) return res;
            else{
                res.add(1);
                return res;
            }
        }
        List<Integer> pre = getRow(rowIndex - 1);
        for (int i = 0; i <= rowIndex; i++){
            if (i == 0 || i == rowIndex) res.add(1);
            else res.add(pre.get(i - 1) + pre.get(i));
        }
        return res;
    }
}
