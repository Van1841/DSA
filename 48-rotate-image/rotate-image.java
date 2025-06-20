class Solution {
    public void rotate(int[][] matrix) {
        /*int n = matrix.length;
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
        }*/

        
        // firstly we will transpose the matrix
        //keep in mind for first for loop of i, we have to go till length-2 times
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //now just need to reverse each row of the matrix.
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }
    }
    public void reverse(int[][] arr,int row){
        int i=0;
        int j=arr[0].length-1;
        while(i<j){
            int temp=arr[row][i];
            arr[row][i]=arr[row][j];
            arr[row][j]=temp;
            i++;
            j--;
        }
    }
}

    