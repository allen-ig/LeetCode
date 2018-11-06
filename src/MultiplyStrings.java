public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] pos = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--){
            int int1 = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--){
                int int2 = num2.charAt(j) - '0';
                int temp = int1 * int2;
                int index1 = i + j;
                int index2 = i + j + 1;
                int sum = temp + pos[index2];
                pos[index1] += sum / 10;
                pos[index2] = sum % 10;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int num : pos) {
            if (num != 0 || res.length() != 0) res.append(num);
        }
        return res.length() == 0 ? "0" : res.toString();
    }
}
