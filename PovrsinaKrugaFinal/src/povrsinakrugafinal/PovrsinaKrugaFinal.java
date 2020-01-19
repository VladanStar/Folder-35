
package povrsinakrugafinal;

import java.util.Scanner;


public class PovrsinaKrugaFinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double p;
        final double PI = 3.1415;
        System.out.println("Unesite poluprecnik r: ");
        r = input.nextInt();
        p = r*r*PI;
        System.out.println("Povrsina kruga je: "+ p);
        
        
    }
    
}
