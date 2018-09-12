import java.util.*;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> set = new HashSet<>(Arrays.asList("..", ".", ""));
        String res = "";
        for (String dir : path.split("/")){
            if (dir.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!set.contains(dir)) stack.push(dir);
        }
        for (String str : stack) res = "/" + str + res;
        return res.equals("") ? "/" : res;
    }
}
