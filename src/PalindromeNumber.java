public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x <= 0 || x % 10 == 0) return false;
        int origin = x, res = 0;
        while (x != 0){
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res == origin;
    }
}

