class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] ans = new int[n][n];

        for(int rows = 0; rows < matrix.length; rows++){
            for(int cols = 0; cols < matrix.length ; cols++){
                ans[rows][cols] = matrix[rows][cols];
            }
        }

        for(int rows = 0; rows < matrix.length; rows++){
            for(int cols = 0; cols < matrix.length ; cols++){
                matrix[rows][cols] = ans[n-cols-1][rows];
            }
        }
    }
}