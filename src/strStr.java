public class strStr {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (n == 0) return 0;
        if (m < n) return -1;
        int fast = n - 1;
        int slow = 0;
        boolean isSame = true;
        while (fast < m){
            isSame = haystack.substring(slow, fast + 1).equals(needle);
            if (!isSame){
                slow++;
                fast++;
            }else break;
        }
        return isSame ? slow : -1;
    }
}
