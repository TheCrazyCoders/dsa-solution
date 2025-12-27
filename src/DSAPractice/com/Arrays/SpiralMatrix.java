package DSAPractice.com.Arrays;

import java.util.Arrays;

public class SpiralMatrix {
    public static int[][] spiralMatrix(int n){
        int count = 1;
        int minR =0, maxR = n-1;
        int minC = 0, maxC = n-1;
        int[][] matrix = new int[n][n];
        while(minR <= maxR && minC <= maxC) {
            for (int row = minC; row < maxC; row++) {
                matrix[row][maxC] = count++;
                minR--;
            }
            for (int col = maxC; col < maxR; col++) {
                matrix[col][maxC] = count++;
                maxC--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result = spiralMatrix(n);
        for (int[] r : result){
            System.out.println(Arrays.toString(r));
        }


    }
}
