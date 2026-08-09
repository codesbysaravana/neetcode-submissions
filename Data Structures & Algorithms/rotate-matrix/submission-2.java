class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length-1;

        while(left < right) {
            int[] temp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;
            
            left++;
            right--;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[row][col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = transpose[i][j];
            }
        }
    }
}
