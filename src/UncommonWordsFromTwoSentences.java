import java.util.ArrayList;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> list = new ArrayList<>();
        List<String> visited = new ArrayList<>();
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        for (String anA : a) {
            if (!list.contains(anA) && !visited.contains(anA)) list.add(anA);
            else {
                list.remove(anA);
                visited.add(anA);
            }
        }

        for (String aB : b) {
            if (!list.contains(aB) && !visited.contains(aB)) list.add(aB);
            else {
                list.remove(aB);
                visited.add(aB);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
