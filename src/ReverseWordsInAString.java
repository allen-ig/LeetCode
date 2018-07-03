public class ReverseWordsInAString {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            if (!words[i].equals("")) {
                res.append(words[i].trim());
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
}
