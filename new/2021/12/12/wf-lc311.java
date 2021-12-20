class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        if (mat1 == null || mat1.length == 0 || mat1[0] == null || mat1[0].length == 0) {
            return mat2;
        }
        if (mat2 == null || mat2.length == 0 || mat2[0] == null || mat2[0].length == 0) {
            return mat1;
        }
        
        int rowA = mat1.length;
        int colA = mat1[0].length;
        int rowB = mat2.length;
        int colB = mat2[0].length;
        
        int[][] res = new int[rowA][colB];
        
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                int sum = 0;
                for (int k = 0; k < colA; k++) {
                    sum += mat1[i][k] * mat2[k][j];
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}