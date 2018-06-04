public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        int count = 0;
        for (char c : word.toCharArray()){
            if (isCapital(c)) count++;
        }
        return count == 0 || count == word.length() || (isCapital(first) && count == 1);
    }

    private boolean isCapital(char c){
        return c >= 'A' && c <= 'Z';
    }
}
