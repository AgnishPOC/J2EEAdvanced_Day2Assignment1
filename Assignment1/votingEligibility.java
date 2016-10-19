package Day2.Assignment1;

import java.util.Scanner;

public class votingEligibility {

	public static void main(String[] args) {
		System.out.println("Please Enter the Age of the Person");
		Scanner user_input = new Scanner(System.in);
		int age;
		age = user_input.nextInt();
		user_input.close();
		if (age >= 18)
			System.out.println("You are eligible to vote");
		else
			System.out.println("You are underage,please try after " + (-1 * (age - 18)) + " years");
	}

}
