public class BinaryGap {
    public int binaryGap(int N) {
        int count = 0;
        int max = 0;
        boolean tag = false;
        while (N != 0){
            if (N % 2 == 1){
                if (!tag) tag = true;
                else {
                    max = Math.max(max, ++count);
                    count = 0;
                }
            }
            else if (tag) count++;
            N >>= 1;
        }
        return max;
    }
}
