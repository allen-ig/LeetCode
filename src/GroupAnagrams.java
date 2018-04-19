import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> hashmap = new HashMap<>();
        if (strs == null || strs.length == 0) return new ArrayList<>();
        for (String s: strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            if (!hashmap.containsKey(key)) hashmap.put(key, new ArrayList<>());
            hashmap.get(key).add(s);
        }
        return new ArrayList<>(hashmap.values());
    }
}
