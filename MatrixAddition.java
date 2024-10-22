package matrixaddition;

//Tania Charles
import java.util.Scanner;

public class MatrixAddition {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Step 1: Get dimensions of the first matrix
     System.out.println("Enter the number of rows for the first matrix: ");
     int rows1 = scanner.nextInt();
     System.out.println("Enter the number of columns for the first matrix: ");
     int columns1 = scanner.nextInt();

     // Initialize the second matrix dimensions
     int rows2, columns2;

     // Step 2: Get dimensions of the second matrix and check for matching dimensions
     while (true) {
         System.out.println("Enter the number of rows for the second matrix: ");
         rows2 = scanner.nextInt();
         System.out.println("Enter the number of columns for the second matrix: ");
         columns2 = scanner.nextInt();

         if (rows1 == rows2 && columns1 == columns2) {
             break; // dimensions match
         } else {
             System.out.println("Dimension mismatch. Please enter the same dimensions as the first matrix.");
         }
     }

     // Step 3: Input values for the first matrix
     int[][] matrix1 = new int[rows1][columns1];
     System.out.println("Enter the values for the first matrix:");
     for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < columns1; j++) {
             matrix1[i][j] = scanner.nextInt();
         }
     }

     // Step 4: Input values for the second matrix
     int[][] matrix2 = new int[rows1][columns1];
     System.out.println("Enter the values for the second matrix:");
     for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < columns1; j++) {
             matrix2[i][j] = scanner.nextInt();
         }
     }

     // Step 5: Add the matrices
     int[][] resultMatrix = new int[rows1][columns1];
     for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < columns1; j++) {
             resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
         }
     }

     // Step 6: Display the result
     System.out.println("Matrix 1 + Matrix 2 = Result Matrix:");
     for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < columns1; j++) {
             System.out.print(matrix1[i][j] + " ");
         }
         if (i == 0) System.out.print(" + ");
         else if (i == 1) System.out.print(" = ");
         else System.out.print("   ");
         for (int j = 0; j < columns1; j++) {
             System.out.print(matrix2[i][j] + " ");
         }
         System.out.print("  ");
         for (int j = 0; j < columns1; j++) {
             System.out.print(resultMatrix[i][j] + " ");
         }
         System.out.println();
     }

     scanner.close();
 }
}
