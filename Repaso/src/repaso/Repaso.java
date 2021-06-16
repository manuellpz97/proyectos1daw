/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        int mayor=0;
        int menor=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        
        numero = teclado.nextInt();
        while (numero!=-1){
            if(numero>mayor){
                mayor=numero;
            }
            else if(numero<menor){
                menor=numero;
            }
            System.out.println("Dime un numero: ");
            numero=teclado.nextInt();
        }
        System.out.println("El mayor de los numeros introducidos has sido "+mayor);
        System.out.println("El menor de los numeros introducidos ha sido "+menor);
        System.out.println("La suma del menor y el mayor de los numeros es "+(mayor+menor));
        System.out.println("La media de ambos numeros es "+ (mayor+menor)/2);
        
                
    }
    
}
