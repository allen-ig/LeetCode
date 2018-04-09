public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while(n > 0){
            n--;
            res.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return res.toString();
    }

}
