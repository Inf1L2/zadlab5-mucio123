package pl.edu.ur.oopl5;
import java.util.Scanner;
public class pracownik {    
    public String imie = "";
    public String nazwisko = "";
    public int wiek = 0;
    public String stanowisko = "";    
    Scanner wej = new Scanner(System.in);
    public pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    public pracownik() {
    }    
    public void dodaj(){
        System.out.println("\nPodaj dane pracownika: ");
        System.out.println("Imie: ");
        this.imie = wej.nextLine();
        System.out.println("Nazwisko: ");
        this.nazwisko = wej.nextLine();
        System.out.println("Wiek: ");
        this.wiek = wej.nextInt();
        System.out.println("Stanowisko: ");
        this.stanowisko = wej.nextLine();
    }   
    }