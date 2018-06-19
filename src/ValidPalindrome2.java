public class ValidPalindrome2 {
    /**
     * time: O(n)
     * space: O(1)
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while(start < end && s.charAt(start) == s.charAt(end)){
            start++;
            end--;
        }
        return helper(s, start + 1, end) || helper(s, start, end - 1) || start >= end;
    }

    public boolean helper(String s, int start, int end){
        while (start < end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else return false;
        }
        return true;
    }
}
