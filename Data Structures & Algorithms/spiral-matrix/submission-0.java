class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int down = matrix.length-1;

        if (matrix == null || matrix.length == 0) return list;

        while(top <= down && left <= right) {
            for(int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=down; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= down) {
                for(int i=right; i>= left; i--) {
                    list.add(matrix[down][i]);
                }
                down--;
            } 

            if(left <= right) {
                for(int i=down; i>= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            } 
        }

        return list;
    }
}
