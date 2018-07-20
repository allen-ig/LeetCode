import java.util.HashMap;

public class WordPattern {
    /**
     * time: O(n) worst: O(n ^ 2)
     * space: O(n)
     * @param pattern
     * @param str
     * @return
     */
    public boolean wordPattern(String pattern, String str){
        HashMap<Character, String> map = new HashMap<>();
        String[] target = str.split(" ");
        if (pattern.length() != target.length) return false;
        for (int i = 0; i < target.length; i++){
            char c = pattern.charAt(i);
            if (map.containsKey(c)){
                if (!map.get(c).equals(target[i])) return false;
            }else {
                if (map.containsValue(target[i])) return false;
                map.put(c, target[i]);
            }
        }
        return true;
    }
}
