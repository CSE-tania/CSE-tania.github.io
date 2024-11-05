package CoffeeHour;

	// Tania Charles
	// CoffeeTester class to create instances of Coffee, test accessors, mutators, and methods.

	import java.util.Scanner;

	public class CoffeeTest {
	    
	    // Main method to run the program
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Scanner object to read user input
	        boolean continueProgram = true; // Boolean flag to control the loop

	        System.out.println("Welcome to the Coffee Hour!!!"); // Welcome message

	        // Loop to allow the user to create coffee objects until they choose to stop
	        while (continueProgram) {
	            // Asking user for first coffee's details
	            System.out.println("What’s the name of the first coffee?");
	            String name1 = scanner.nextLine();
	            System.out.println("What’s the caffeine content?");
	            int caffeine1 = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character after nextInt

	            // Create first Coffee object
	            Coffee coffee1 = new Coffee(name1, caffeine1);

	            // Asking user for second coffee's details
	            System.out.println("What’s the name of the second coffee?");
	            String name2 = scanner.nextLine();
	            System.out.println("What’s the caffeine content?");
	            int caffeine2 = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character after nextInt

	            // Create second Coffee object
	            Coffee coffee2 = new Coffee(name2, caffeine2);

	            // Print details of the first coffee
	            System.out.println("\nCoffee 1 Details:");
	            System.out.println(coffee1);
	            System.out.println("It would take " + coffee1.riskyAmount() + " cups of " + coffee1.getName() + " before it’s dangerous to drink more.");

	            // Print details of the second coffee
	            System.out.println("\nCoffee 2 Details:");
	            System.out.println(coffee2);
	            System.out.println("It would take " + coffee2.riskyAmount() + " cups of " + coffee2.getName() + " before it’s dangerous to drink more.");

	            // Compare both coffee objects
	            System.out.println("\nAre both coffees the same? " + coffee1.equals(coffee2));

	            // Ask if the user wants to create more coffee objects
	            System.out.println("\nDo you want to create more coffee objects? Enter 'Yes' or 'No':");
	            String response = scanner.nextLine();
	            if (response.equalsIgnoreCase("No")) {
	                continueProgram = false; // Exit the loop if user says 'No'
	            }
	        }

	        scanner.close(); // Close the scanner object
	        System.out.println("Goodbye!"); // Exit message
	    }
	}


	


