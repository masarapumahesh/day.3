package problem2;
import java.util.Scanner;
public class dowhile {

	public static void main(String[] args) {
		System.out.println("enter n valve");
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		
		int sum =0;
		int i=1;
		do {sum=sum+1;
		       i++;
		}
		while(i<=n);
		System.out.println(sum);
		}
		
	}