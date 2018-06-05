import java.util.HashSet;

/**
 * time: O(M + N)
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> temp = new HashSet<>();
        int res = 0;
        for (char c : J.toCharArray()){
            temp.add(c);
        }

        for (char c : S.toCharArray()){
            if (temp.contains(c)) res++;
        }
        return res;
    }
}
