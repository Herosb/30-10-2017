import java.util.Scanner;
public class zadanie1 {

	public static void main(String[] args) 
	{
		int  a;
		String t;
		Scanner in = new Scanner(System.in);
		t = in.nextLine();
		a = Integer.parseInt(t);
		for (int i=1;i<=a;i+=2); {
					
					System.out.print(i+"");
					}
	}
}



