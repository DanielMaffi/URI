/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1006;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Daniel Maffi
 */
public class Uri1006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Locale.setDefault(Locale.US);
       
       double Media;
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        
        input.close();
        
        Media =((A*2)+(B*3)+(C*5))/10.0;
                
        System.out.printf("MEDIA = %.1f", Media );
        System.out.println("");
    }
    
}
