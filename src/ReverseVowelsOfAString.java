public class ReverseVowelsOfAString {
    /**
     * space: O(1)
     * time: O(n)
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return "";
        String vowels = "aeiouAEIOU";
        int i = 0; int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j){
            while (i < j && !vowels.contains(chars[i] + "")){
                i++;
            }
            while (i < j && !vowels.contains(chars[j] + "")){
                j--;
            }
            swap(chars, i, j);
            i++;
            j--;
        }
        return new String(chars);
    }

    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
