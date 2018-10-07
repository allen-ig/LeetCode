public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int low = 0;
        int high = chars.length - 1;
        while (low < high){
            while (!((chars[low] - 'A' >= 0 && chars[low] - 'A' <= 25) || (chars[low] - 'a' >= 0 && chars[low] - 'a' <= 25)) && low < high) low++;
            while (!((chars[high] - 'A' >= 0 && chars[high] - 'A' <= 25) || (chars[high] - 'a' >= 0 && chars[high] - 'a' <= 25)) && low < high) high--;
            swap(chars, low, high);
            low++;
            high--;
        }
        return new String(chars);
    }

    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
