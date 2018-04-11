public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        StringBuilder res = new StringBuilder();
        String prev = countAndSay(n - 1);
        char temp = prev.charAt(0);
        int count = 1;
        for (int i = 1; i < prev.length(); i++){
            if (prev.charAt(i) == temp){
                count++;
            }else{
                res.append(count);
                res.append(temp);
                temp = prev.charAt(i);
                count = 1;
            }
        }
        res.append(count);
        res.append(temp);
        return res.toString();
    }
}
