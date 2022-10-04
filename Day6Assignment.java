
import java.util.Scanner;

public class Day6Assignment {

	void perfect(int a) {
		int sum=0;
		for(int i=1; i<a; i++) {
			if(a%i == 0) {
				sum+=i;
			}
		}

		if(sum==a) 
			System.out.println(a +" This is a perfect number");

		else
			System.out.println(a +" This is not a perfect number");
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		Day6Assignment A = new Day6Assignment();
		A.perfect(a);
	}
}