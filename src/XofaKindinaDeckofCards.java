import java.util.HashMap;
import java.util.Map;

public class XofaKindinaDeckofCards  {
    /**
     * time: O(N)
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : deck) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int num : map.values()) res = gcd(num, res);
        return res > 1;
    }

    private int gcd(int a, int b){
        return b > 0 ? gcd(b, a % b) : a;
    }
}
