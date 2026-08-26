/* class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        int idx = 0;
        char prev = board[0][0];

        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                if(board[i][j] == word.charAt(idx)) {
                    //System.out.println(i-1);
                    if (board[i-1][j] == prev || 
                        board[i][j-1] == prev || 
                        board[i-1][j-1] == prev || 
                        board[i-1][j+1] == prev) {
                        
                        prev = word.charAt(idx);
                        idx++;
                    } else if(prev == board[0][0]) {
                        prev = word.charAt(idx);
                        idx++;
                    }  
                }
            }
        }
        
    int wordLen = word.length()-1;

    if(idx == wordLen) {
        return true;
    } 
    return false;
    
    }
} */


class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean ans = backtrack(board, i, j, 0, word);
                    if(ans) return true;
                }
            } 
        }

        return false;
    }

    public boolean backtrack(char[][] board, int i, int j, int idx, String word) {
        if(idx == word.length()) {
            return true;
        }

        if(i >= board.length || j >= board[0].length || i<0 || j < 0) {
            return false;
        }

        if(board[i][j] != word.charAt(idx)) {
            return false;
        }

        char ch = '#';
        if(board[i][j] == word.charAt(idx)) {
            ch = board[i][j];
            board[i][j] = '#';
        }

        boolean res = backtrack(board, i+1, j, idx+1, word) || //neighbour checking
        backtrack(board, i-1, j, idx+1, word) ||
        backtrack(board, i, j-1, idx+1, word) ||
        backtrack(board, i, j+1, idx+1, word);

        board[i][j] = ch;
        return res;
    }
}