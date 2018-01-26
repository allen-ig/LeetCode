public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            result[i] = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
        }
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }
        return result;
    }
}
