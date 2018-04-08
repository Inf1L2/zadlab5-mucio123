package pl.edu.ur.oopl5;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //ksiegarnia k = new ksiegarnia("Heri pota", "roulink", 69, 1997, 50);
        //System.out.println(k.toString());  
       // k.setCena(25);
       // System.out.println(k.toString()); 
       //Date date = new Date();
       Scanner in = new Scanner (System.in);
       int dzien;
       dzien = in.nextInt();
        datta d = new datta(dzien,3,9987);
        System.out.println(d.toString()); 
        if(d.dzien<8) d.zwieksz();
        else d.zmniejsz();
    }
    
}
