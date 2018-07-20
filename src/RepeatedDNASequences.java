import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {
    /**
     * time: O(n)
     * space: O(n)
     * @param s
     * @return
     */
    public List<String> findRepeatedDnaSequences(String s){
        HashSet<String> repeated = new HashSet<>();
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++){
            String target = s.substring(i, i + 10);
            if (!seen.add(target)) repeated.add(target);
        }
        return new ArrayList(repeated);
    }
}
