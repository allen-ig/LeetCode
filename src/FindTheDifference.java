public class FindTheDifference {
    /**
     * space: O(1)
     * time: O(n)
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t){
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return c;
        }
        return 0;
    }
}
