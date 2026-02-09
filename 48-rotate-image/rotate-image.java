class Solution {
    public void rotate(int[][] matrix) {
       int r=matrix.length;
       int c=matrix[0].length;
       int[][] res=new int[r][c];
       for(int i=0;i<r;i++){
        for(int j=i;j<c;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       }
       for(int k=0;k<r;k++){
       for(int i=0,j=r-1;i<j;i++,j--){
       int temp=matrix[k][i];
       matrix[k][i]=matrix[k][j];
       matrix[k][j]=temp;
       }}
    }
}