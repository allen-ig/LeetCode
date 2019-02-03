public class SumofEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int len = A.length;
        int[] res = new int[len];
        int sum = 0;
        for (int aA : A) {
            if (aA % 2 == 0) sum += aA;
        }
        for (int i = 0; i < len; i++){
            int index = queries[i][1];
            int num = queries[i][0];
            if (A[index] % 2 == 0 && num % 2 == 0) sum += num;
            else if (A[index] % 2 != 0 && num % 2 != 0) sum += A[index] + num;
            else if (A[index] % 2 == 0 && num % 2 != 0) sum -= A[index];
            A[index] += queries[i][0];
            res[i] = sum;
        }
        return res;
    }
}
