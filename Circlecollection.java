// Tania Charles
package circlecollection;

	// Tania Charles
	import java.util.Scanner;

	public class Circlecollection {
	    private static final double PI = 3.14;
	    private static double[] circles; // Array to store circle areas

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int size;

	        // Ask user for a valid size for the collection
	        while (true) {
	            System.out.print("Enter the number of circles to store in the collection: ");
	            size = scanner.nextInt();
	            if (size > 0) {
	                circles = new double[size]; // Initialize the array
	                break; // Valid size entered, exit loop
	            } else {
	                System.out.println("Invalid size. Please enter a positive integer.");
	            }
	        }

	        // Get the radius for each circle
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter the radius of circle " + (i + 1) + ": ");
	            double radius = scanner.nextDouble();
	            circles[i] = calculateArea(radius); // Calculate area and store it
	        }

	        int option;
	        do {
	            // Display menu options
	            System.out.println("\nMenu:");
	            System.out.println("1. Sort and display circles' areas (smallest to largest)");
	            System.out.println("2. Sort and display circles' areas (largest to smallest)");
	            System.out.println("3. Display unique circles' areas");
	            System.out.println("4. Quit");
	            System.out.print("Choose an option: ");
	            option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    sortAreasAscending(); // Sort areas in ascending order
	                    displayAreas(); // Display sorted areas
	                    break;
	                case 2:
	                    sortAreasDescending(); // Sort areas in descending order
	                    displayAreas(); // Display sorted areas
	                    break;
	                case 3:
	                    displayUniqueAreas(); // Display unique areas
	                    break;
	                case 4:
	                    System.out.println("Quitting the program. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        } while (option != 4);

	        scanner.close(); // Close the scanner resource
	    }

	    // Calculate area of a circle using its radius
	    private static double calculateArea(double radius) {
	        return PI * radius * radius;
	    }

	    // Sort areas in ascending order (smallest to largest)
	    private static void sortAreasAscending() {
	        if (circles.length == 0) {
	            System.out.println("Cannot sort an empty collection.");
	            return;
	        }
	        for (int i = 0; i < circles.length - 1; i++) {
	            for (int j = 0; j < circles.length - 1 - i; j++) {
	                if (circles[j] > circles[j + 1]) {
	                    double temp = circles[j];
	                    circles[j] = circles[j + 1];
	                    circles[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("Areas sorted from smallest to largest.");
	    }

	    // Sort areas in descending order (largest to smallest)
	    private static void sortAreasDescending() {
	        if (circles.length == 0) {
	            System.out.println("Cannot sort an empty collection.");
	            return;
	        }
	        for (int i = 0; i < circles.length - 1; i++) {
	            for (int j = 0; j < circles.length - 1 - i; j++) {
	                if (circles[j] < circles[j + 1]) {
	                    double temp = circles[j];
	                    circles[j] = circles[j + 1];
	                    circles[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("Areas sorted from largest to smallest.");
	    }

	    // Display sorted areas
	    private static void displayAreas() {
	        if (circles.length == 0) {
	            System.out.println("No areas to display.");
	            return;
	        }
	        System.out.println("Circle Areas:");
	        for (double area : circles) {
	            System.out.printf("%.2f%n", area);
	        }
	    }

	    // Display unique areas
	    private static void displayUniqueAreas() {
	        boolean[] isUnique = new boolean[circles.length]; // Track unique areas
	        boolean hasDuplicates = false;

	        // Find duplicates
	        for (int i = 0; i < circles.length; i++) {
	            if (isUnique[i]) continue; // Skip already checked
	            boolean duplicateFound = false;
	            for (int j = i + 1; j < circles.length; j++) {
	                if (circles[i] == circles[j]) {
	                    duplicateFound = true;
	                    isUnique[j] = true; // Mark as non-unique
	                }
	            }
	            if (duplicateFound) {
	                hasDuplicates = true;
	                System.out.printf("Duplicate area found: %.2f%n", circles[i]);
	            }
	        }

	        // Display unique areas
	        System.out.println("Unique Circle Areas:");
	        for (int i = 0; i < circles.length; i++) {
	            if (!isUnique[i]) { // Only print unique areas
	                System.out.printf("%.2f%n", circles[i]);
	            }
	        }

	        if (!hasDuplicates) {
	            System.out.println("All areas are unique.");
	        }
	    }
	}
