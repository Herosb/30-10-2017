import java.util.Scanner;
 
public class Zadanie
{
    int x;
   
    public Zadanie()
    {
        x=(int)(Math.random()*101);
    }
    
    public int Sprawdz(int a)
    {
        if (x == a) return 0;
        if (x < a) return -1;
        if (x > a) return 1;
        return 0;
    }
    
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);}
        int liczba;
        {
        Zadanie zad = new Zadanie();
        System.out.println("Wylosowano liczbe z zakresu 0-100, zgadnij ja: ");
        
        for (;;)
        {
            liczba = Integer.parseInt(in.next());}
        { 
        if (zad.Sprawdz(liczba)==0) { System.out.println("Trafiles, gratuluje "); break; }
            if (zad.Sprawdz(liczba)==1) { System.out.println("Liczba za mala, jescze raz "); }
            if (zad.Sprawdz(liczba)==-1) { System.out.println("Liczba za duza, jeszcze raz "); }
        }
    }
}