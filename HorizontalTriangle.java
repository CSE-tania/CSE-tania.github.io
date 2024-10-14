//copyright Tania Charles
package horizontaltriangle;

import java.util.Scanner;

public class HorizontalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        
        // Draw the top half of the triangle
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }
        
        // Draw the bottom half of the triangle
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }
        
        // End of program message
        System.out.println("End of program!");
        
        scanner.close();
    }
}
