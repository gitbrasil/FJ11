/**
 * Imprima os fatoriais de 1 a 10.
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.fj;

public class FJ_03_13_Ex04 {

    public static void main(String[] args) {

        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            if ( i == 0){
                System.out.println(i);
            } else {
                System.out.println(fatorial);  
            }
            fatorial = fatorial * i;
           
        }
    }

}
