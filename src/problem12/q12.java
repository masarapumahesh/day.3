package problem12;
import java.util.*;
public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float s,d,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the speed");
		s=sc.nextFloat();
		System.out.println("enter the distance");
		d=sc.nextFloat();
		System.out.println("enter the time");
		t= sc.nextFloat();
		if(s>=60&&t==60&&d==1)
		{
			System.out.println("yes");
		}
		else 
			
		{
			System.out.println("no");
		}
	}

}
