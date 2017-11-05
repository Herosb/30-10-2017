import java.util.Scanner;

public class Zadanie3 {
	public static void main(String[] args) {

		System.out.println("Wprowadz liczbe");
		Scanner xy = new Scanner(System.in);

		int a = xy.nextInt();
		int b = 1;
		while (b <= a) {
			System.out.println(b);
			b *= 2;

		}

	}

}
