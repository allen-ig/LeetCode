public class StudentAttendanceRecord {
    /**
     * time: O(n)
     * space: O(1)
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++){
            if (l > 2 || a > 1) return false;
            char c = s.charAt(i);
            if (c == 'A'){
                l = 0;
                a++;
            }else if (c == 'L'){
                l++;
            }else{
                l = 0;
            }
        }
        return !(a > 1 || l > 2);
    }
}
