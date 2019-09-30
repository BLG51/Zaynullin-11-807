public class Magic {
    public static void main(String[] args) {
        int[][] matrix = {{6,1,8},{7,5,3},{2,9,4}};
                //if () else if() else
        int glav = 0; int obr = 0;
        int n = matrix.length; //число строк
        int m = matrix[0].length; //число столбцов
        for (int i = 0; i < n; i++) {
            glav += matrix[i][i];
            //collateral
            obr += matrix[n-i-1][n-i-1];
        }
    }
}
