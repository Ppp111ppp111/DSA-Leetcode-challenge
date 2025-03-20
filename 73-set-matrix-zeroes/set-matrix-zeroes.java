class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
//initilize array row and col for marked
boolean []row=new boolean[n];
boolean []col=new boolean[m];
//identify where element is zero and marked in row and col
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(matrix[i][j]==0){
             row[i]=true;
             col[j]=true;   
               }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]|| col[j]){
   matrix[i][j]=0;
                }
            }
        }
    }
}