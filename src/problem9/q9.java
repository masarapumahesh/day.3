package problem9;
import java.util.*;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,cols,stdNo,ans;
		Scanner sc= new Scanner(System.in);
		System.out.println("entyer the rows ");
		rows = sc.nextInt();
		System.out.println("entyer the cols ");
		cols = sc.nextInt();
		System.out.println("entyer the student roll no ");
		stdNo = sc.nextInt();
		ans=(rows*cols)-8;
		if(stdNo<ans)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no ");
		}
	}

}
