package problem5;
import java.util.*;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="student type";
		float tf,bf,hf;
	   Scanner sc =new Scanner (System.in);
		name = sc.nextLine();
		tf=sc.nextFloat();
		bf=sc.nextFloat();
		hf=sc.nextFloat();
		switch(name)
		{
		case "MSDS":System.out.println(tf+bf);
		break;
		case "MSH":System.out.println(tf+hf);
		break;
		case"MGSDS":System.out.println(150/100*tf+bf);
		break;
		case"MGSG":System.out.println(150/100*tf+hf);
		}
	}

}
