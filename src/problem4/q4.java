package problem4;
import java .util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float  sp,cp;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the prize of dozen bananas value ");
		sp= sc.nextFloat();
		System.out.println("enter the price of one banana being sold ");
		cp=sc.nextFloat();
		
		if(cp-sp>0)
		{
			System.out.println("loss" +(cp-sp));
		}
		else if (cp-sp<0)
		{
			System.out.println("profit"+ (sp-cp));
		}
		else
		{
			System.out.println("no loss and profit");
		}
        
	}

}
