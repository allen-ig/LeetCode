public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int low = 0, high = len - 1, index = len - 1;
        while (low <= high){
            int lowSq = A[low] * A[low];
            int highSq = A[high] * A[high];
            if (lowSq < highSq){
                res[index] = highSq;
                high--;
            }else{
                res[index] = lowSq;
                low++;
            }
            index--;
        }
        return res;
    }
}
