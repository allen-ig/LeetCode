import java.util.HashMap;

public class IsomorphicStrings {
    /**
     * time: O(n)
     * space: O(n)
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (map.containsKey(schar)) {
                if (!map.get(schar).equals(tchar)) return false;
            }else{
                if (!map.containsValue(tchar)) map.put(schar, tchar);
                else return false;
            }
        }
        return true;
    }
}
