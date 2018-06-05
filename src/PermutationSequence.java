import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int sum = 1;
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
            fact[i] = sum;
            nums.add(i);
        }

        StringBuilder res = new StringBuilder();
        k--;

        for (int i = 1; i <= n; i++){
            int temp = k / fact[n - i];
            res.append(Integer.toString(nums.get(temp)));
            nums.remove(temp);
            k -= temp * fact[n - i];
        }
        return res.toString();
    }
}
