
import java.util.Scanner;
public class Zadanie8z2zbioru {

	public static void main(String[] args) {
		Scanner xy = new Scanner(System.in);
		System.out.print("Podaj licze");
		int x = xy.nextInt();
		int i;
		System.out.print(x+" dzileniki: ");
		for(i=1;i<x;i++)
			if(x % i == 0) {
				System.out.print(i+ "");
			}
		
		
		
	}

}
