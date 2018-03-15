public class IntegerToEnglishWords {
    String[] number = {"", "One","Two","Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tenth = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thousand = {"", "Thousand", "Million", "Billion", "Trillion"};
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        int i = 0;
        String res = "";
        while (num != 0){
            if (num % 1000 != 0) {
                res = helper(num % 1000) + thousand[i] + " " + res;
            }
            num /= 1000;
            i++;
        }
        return res.trim();
    }

    private String helper(int num){
        if (num == 0) return "";
        else if (num < 20)
            return number[num] + " ";
        else if (num < 100)
            return tenth[num / 10] + " " + helper(num % 10);
        else
            return number[num / 100] + " Hundred " + helper(num % 100);
    }
}
