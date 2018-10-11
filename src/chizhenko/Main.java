package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double r;
		double c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter radius of a circle:");
		r = sc.nextDouble();
		sc.close();
		c = 2 * Math.PI * r;
		
		System.out.println("length of a circle: " + c);

	}

}
