public class RepeatedSubstringPattern {
    /**
     * time: O(nlogn)??
     * space: O(n)
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--){
            if (len % i == 0){
                int remain = len / i;
                String sub = s.substring(0, i);
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < remain; j++){
                    temp.append(sub);
                }
                if (temp.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
