class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        boolean flag = false;
        int val = 0;
        for(int i=0; i<board.length; i++) {
            Set<Character> set= new HashSet<>();
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] != '.' && set.contains(board[i][j])) {
                    flag = false;
                    return false;
                }
                if(board[i][j] != '.') set.add(board[i][j]);
            }
            set.clear();
        }

        for(int i=0; i<board.length; i++) {
            Set<Character> set= new HashSet<>();
            for(int j=0; j<board[0].length; j++) {
                if(board[j][i] != '.' && set.contains(board[j][i])) {
                    flag = false;
                    return false;
                }
                if(board[j][i] != '.') set.add(board[j][i]);
            }
            set.clear();
        }

        boolean firstbox = checker3by3(board, 0, 2, 0, 2);
        boolean secondbox = checker3by3(board, 0, 2, 3, 5);
        boolean thirdbox = checker3by3(board, 0, 2, 6, 8);
        boolean fourthbox = checker3by3(board, 3, 5, 0, 2);
        boolean fifthbox = checker3by3(board, 3, 5, 3, 5);
        boolean sixbox = checker3by3(board, 3, 5, 6, 8);
        boolean sevenbox = checker3by3(board, 6, 8, 0, 2);
        boolean eigthbox = checker3by3(board, 6, 8, 3, 5);
        boolean ninthbox = checker3by3(board, 6, 8, 6, 8);

        if(firstbox &&
        secondbox &&
        thirdbox &&
        fourthbox &&
        fifthbox &&
        sixbox &&
        sevenbox &&
        eigthbox &&
        ninthbox) {
            flag = true;
        }

        return flag;
    }

    private boolean checker3by3(char[][] matrix, int istart, int iend, int jstart, int jend) {
        Set<Character> newset = new HashSet<>();
        for(int i=istart; i<=iend; i++) {
            for(int j=jstart; j<=jend; j++) {
                if(matrix[i][j] != '.' && newset.contains(matrix[i][j])) {
                    return false;
                }
                if(matrix[i][j] != '.') newset.add(matrix[i][j]);
            }
        }

        return true;
    }
}