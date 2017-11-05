import java.util.Scanner;

public class Zadanie11{ 

	 public static void main(String[] args) {
	        char znakGwiazdki = '*';
	        Scanner xy = new Scanner(System.in);

	        System.out.print("Podaj ilosc poziomow choinki: ");
	        int poziomy = xy.nextInt();

	        for (int i = 0; i < poziomy; i++) {
	            for (int j = 0; j < poziomy * 2; j++) {
	                if (j < (poziomy - i) || j > (poziomy + i)) {
	                    System.out.print(" ");
	                } else {
	                    System.out.print(znakGwiazdki);
	                }
	            }
	            System.out.println();
	        }
	    }
	}