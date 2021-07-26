import java.util.*;

public class CHSFORMT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		int a, b;
		while(t-- > 0 && sc.hasNext()) {
		    a = sc.nextInt();
		    b = sc.nextInt();
		    if((a + b) < 3) 
		        System.out.println("1");
		    else if(3 <= (a + b) && (a + b) <= 10)
		        System.out.println("2");
		    else if(11 <= (a + b) && (a + b) <= 60)
		        System.out.println("3");
		    else
		        System.out.println("4");
		}
        sc.close();
	}
}