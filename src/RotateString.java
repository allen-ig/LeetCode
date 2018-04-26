public class RotateString {
    /**
     * space: O(1)
     * time: O(n)
     * @param A original string
     * @param B target string
     * @return
     */
    public boolean rotateString(String A, String B) {
        if (A.length() == 0 && B.length() == 0) return true;
        String temp = A;
        for (int i = 0; i < A.length(); i++){
            temp = helper(temp);
            if (temp.equals(B)) return true;
        }
        return false;
    }

    private String helper(String str){
        String res = str.substring(1, str.length());
        char temp = str.charAt(0);
        res += temp;
        return res;
    }

    /**
     * space: O(1)
     * time: O(len(A) * len(B))??
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString2(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
