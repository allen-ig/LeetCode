import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeyboardRow {

    private final static char[] first = new char[] {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
    private final static char[] second = new char[] {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
    private final static char[] third = new char[] {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<String> res_list = new ArrayList<>();
        int[] count = new int[3];
        for(char c : first) map.put(c, 1);
        for(char c : second) map.put(c, 2);
        for(char c : third) map.put(c, 3);
        for (String word : words){
            if (isValid(word, map)) res_list.add(word);
        }
        return res_list.toArray(new String[0]);
    }

    private boolean isValid(String word, HashMap<Character, Integer> map){
        int[] count = new int[3];
        int len = word.length();
        for (char c : word.toLowerCase().toCharArray()){
            if(map.get(c) == 1) count[0]++;
            if(map.get(c) == 2) count[1]++;
            if(map.get(c) == 3) count[2]++;
        }
        return count[0] == len || count[1] == len || count[2] == len;
    }
}
