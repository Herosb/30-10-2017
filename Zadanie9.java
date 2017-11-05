import java.util.Scanner;

public class Zadanie9 {

	public static void main(String[] args) {
		Scanner xy = new Scanner(System.in);
		System.out.print("Podaj liczbe");
		int x = xy.nextInt();

		boolean pierwsza = true;	
		for(int i=2;i*i<=x;i++) {
			if(x%1==0)
				pierwsza = false;
			
			if(pierwsza)
				System.out.println("Tak");
			else
				System.out.println("Nie");
			
				 
			 }
			
		}
		
		

	}

