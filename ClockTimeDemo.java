package timeconversion;

		import java.util.Scanner;

		public class ClockTimeDemo {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String repeat;

		        do {
		            try {
		                System.out.println("Convert military time into 12-hour clock time!!!");

		                System.out.print("Enter the hours on the military clock: ");
		                int hours = scanner.nextInt();

		                System.out.print("Enter the minutes on the military clock: ");
		                int minutes = scanner.nextInt();

		                System.out.print("Enter the seconds on the military clock: ");
		                int seconds = scanner.nextInt();

		                TimeConverter converter1 = new TimeConverter();
		                converter1.updateTime(hours, minutes, seconds);
		                System.out.print("12-hour clock time → ");
		                converter1.displayTime();

		                System.out.print("Enter 24-hour clock time in the format “hours:minutes:seconds”: ");
		                scanner.nextLine();
		                String timeString = scanner.nextLine();

		                TimeConverter converter2 = new TimeConverter();
		                converter2.updateTime(timeString);
		                System.out.print("12-hour clock time → ");
		                converter2.displayTime();
		            } catch (TimeException e) {
		                System.out.println(e.getMessage());
		            }

		            System.out.print("Would you like to do this again? Enter “Yes” or “No”: ");
		            repeat = scanner.nextLine();
		        } while (repeat.equalsIgnoreCase("Yes"));

		        System.out.println("Exiting the program!");
		        scanner.close();
		    }
		

	}


		
