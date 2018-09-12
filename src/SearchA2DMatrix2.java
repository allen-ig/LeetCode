public class SearchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1 || matrix[0].length < 1) return false;
        int low = 0, high = matrix[0].length - 1;
        while (low <= matrix.length - 1 && high >= 0){
            int mid = (low + high) / 2;
            if (target < matrix[low][high]) high--;
            else if (target > matrix[low][high]) low++;
            else return true;
        }
        return false;
    }
}
