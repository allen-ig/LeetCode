public class NumberOf1Bits {
    public int hammingWeight(int n){
        int count = 0;
        int power2 = 1;
        while (n != 0){
            count += n & power2;
            n >>>= 1;
        }
        return count;
    }
}
