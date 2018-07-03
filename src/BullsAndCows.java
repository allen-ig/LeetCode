public class BullsAndCows {
    /**
     * space: O(1)
     * time: O(n)
     * @param secret
     * @param guess
     * @return
     */
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] nums = new int[10];
        for (int i = 0; i < secret.length(); i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                if (nums[s] < 0) cows++;
                if (nums[g] > 0) cows++;
                nums[s]++;
                nums[g]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
