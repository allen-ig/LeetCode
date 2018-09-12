import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int length = s.length();
        for (int i = 1; i <= 3; i++){
            if (length - i > 9) continue;
            for (int j = i + 1; j <= i + 3; j++){
                if (length - j > 6) continue;
                for (int k = j + 1; k <= j + 3 && k < length; k++){
                    int a = Integer.parseInt(s.substring(0, i));
                    int b = Integer.parseInt(s.substring(i, j));
                    int c = Integer.parseInt(s.substring(j, k));
                    int d = Integer.parseInt(s.substring(k));
                    if (a > 255 || b > 255 || c > 255 || d > 255) continue;
                    String temp = a + "." + b + "." + c + "." + d;
                    if (temp.length() < length + 3) continue;
                    res.add(temp);
                }
            }
        }
        return res;
    }
}
