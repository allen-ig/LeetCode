public class IntegerToRoman {
    public String intToRoman(int num) {
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] integer = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder sb = new StringBuilder();
        for (int i = integer.length - 1; i >= 0; i++){
            while (num >= integer[i]){
                num -= integer[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }
}
