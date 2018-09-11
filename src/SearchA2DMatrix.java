public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
         * time: O(log(mn))
         * space: O(1)
         */
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (target < matrix[mid / n][mid % n]) high = mid - 1;
            else if (target > matrix[mid / n][mid % n]) low = mid + 1;
            else return true;
        }
        return false;
    }
}
