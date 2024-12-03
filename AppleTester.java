//copyright Janyah Gurley
package Apple;

		import java.util.Scanner;

		public class AppleTester {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Welcome to the Apple tester!!!");

		        // Creating the first apple object using the default constructor
		        System.out.println("Creating the first apple!");
		        Apple apple1 = new Apple();  // Default constructor
		        System.out.println("Default values of the first apple object:");
		        apple1.writeOutput();

		        // Prompting the user for details of the second apple
		        System.out.println("Enter the type of the second apple object:");
		        String type = scanner.nextLine();
		        System.out.println("Enter the weight of the second apple object:");
		        double weight = scanner.nextDouble();
		        System.out.println("Enter the price of the second apple object:");
		        double price = scanner.nextDouble();

		        // Creating the second apple object using the parameterized constructor
		        System.out.println("Creating the second apple object!");
		        Apple apple2 = new Apple(type, weight, price);  // Parameterized constructor
		        System.out.println("Values of the second apple object:");
		        apple2.writeOutput();

		        scanner.close();
		    }
		

	}


