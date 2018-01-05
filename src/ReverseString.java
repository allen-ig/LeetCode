public class ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) return s;
        char[] str = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while (low < high){
            char temp = str[low];
            str[low++] = str[high];
            str[high--] = temp;
        }
        return new String(str);
    }
}
