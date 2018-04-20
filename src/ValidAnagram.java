public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for (int aMap : map) {
            if (aMap != 0) return false;
        }
        return true;
    }
}
