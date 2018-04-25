import java.util.*;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        if (s.length() < p.length()) return res;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();
        int begin = 0;
        int end = 0;

        while (end < s.length()){
            char c = s.charAt(end);
            if (map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) counter--;
            }
            end++;

            while (counter == 0){
                char temp = s.charAt(begin);
                if (map.containsKey(temp)){
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0){
                        counter++;
                    }
                }
                if (end - begin == p.length()){
                    res.add(begin);
                }
                begin++;
            }
        }
        return res;
    }
}
