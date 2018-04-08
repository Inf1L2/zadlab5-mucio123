package pl.edu.ur.oopl5;
import java.util.Scanner;
public class stos {    
    Scanner wej = new Scanner(System.in);    
    private int indeks = 0;
    private int rozmiar;
    public int stos[];    
    public stos(int n){
        this.rozmiar = n;
        this.stos = new int[n];
    }    
    public void dej(){
        if (indeks < rozmiar) {
            System.out.print("Podaj liczbe, ktora chcesz dodac na stos: ");
            indeks++;
            stos[indeks] = wej.nextInt();
        } else {
            System.out.println("pelny stos");
        }
    }    
    public void out(){
         if (indeks >= 1) {
            System.out.println("Usuwam element ze stosu");
            stos[indeks] = 0;
            indeks--;
        } else {
            System.out.println("Stos jest pusty");
        }
    }    
    public void wyswietlStos(){
        System.out.println("Stos: ");
        for(int i = indeks; i>=1; i--){
            System.out.println(stos[i]);
        }
    }
    }