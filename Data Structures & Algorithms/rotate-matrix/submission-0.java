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

        int[][] transposed = new int[matrix.length][matrix[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<transposed.length; i++) {
            for(int j=0; j<transposed[0].length; j++) {
                matrix[i][j] = transposed[i][j];
            }
        }

        
    }
}
