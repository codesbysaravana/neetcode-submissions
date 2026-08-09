class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean[] setRow = new boolean[row];
        boolean[] setCol = new boolean[col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                int curr = matrix[i][j];
                if(curr == 0) {
                    setRow[i] = true;
                    setCol[j] = true;
                }   
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(setRow[i] == true) {
                    matrix[i][j] = 0;
                } else if(setCol[j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
