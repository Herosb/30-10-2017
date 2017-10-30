import java.util.Scanner;
public class Zadanie2 {

	public static void main(String[] args) {
		System.out.print("Pierwsza liczba");
		int liczba;
		Scanner odczyt = new Scanner(System.in);
		liczba = odczyt.nextInt();
		int liczba1 = 0;
		do {
			System.out.print("Podaj druga Liczbe musi byc > 1");
			Scanner odczyt2 = new Scanner(System.in);
			liczba1 = odczyt2.nextInt();
		}
		while(liczba1<liczba);
		int suma = 0;
		int a = 0;
		for(a=0;liczba<=liczba1;a++)
		{
			liczba = liczba+a;
			suma = suma + liczba;
		}
		System.out.print(suma);
		
		
			
		}
				
	}


