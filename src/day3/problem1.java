package day3;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		System.out.println("enter n value");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if ((i&1) !=1  ) {
				System.out.print(i);
			}
		}

	}

}
