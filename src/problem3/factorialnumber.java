package problem3;
import java.util.Scanner;
public class factorialnumber {

	public static void main(String[] args) {
		System.out.println("enter factorial number");
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		  for(int i=0;i<n;i++) {
			  if(i%2==0) {
				  System.out.println(i );
				  
			  }
		  }
		

	}

}
