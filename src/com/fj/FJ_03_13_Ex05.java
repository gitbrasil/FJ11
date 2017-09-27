/**
 * Imprima os fatoriais de 1 a 10.
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.fj;

public class FJ_03_13_Ex05 {

    public static void main(String[] args) {

        long fatorial = 1;
        System.out.println("Fatorial com a Variavel long");
        for (int i = 1; i <= 20; i++) {
            if ( i == 0){
                System.out.println(i);
            } else {
                System.out.println(fatorial);  
            }
            fatorial = fatorial * i;
           
        }
    }

}
