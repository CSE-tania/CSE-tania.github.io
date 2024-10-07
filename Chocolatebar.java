//copyright Tania Charles;
package chocolatebar;

import java.util.Scanner;

public class Chocolatebar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter number of dollars: ");
			int N = obj.nextInt();
			int total = N;
			int coupons = N;
			//Loop while number of coupons is greater than 6
			while(coupons>=6){
			    //Find extra chocolates from coupons
			    int extra_chocolates = coupons/6;
			    //add to total chocolates
			    total = total + extra_chocolates;
			    //Reduce the coupons
			    coupons = coupons%6;
			    //New coupons because of extra chocolates
			    coupons = coupons + extra_chocolates;
			}
			System.out.println("Total chocolates "+total);
			System.out.println("Coupons left over "+coupons);
		}
    }

        
	}


