/**
 * Numeros pares e impares
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_13_Ex07 {

    public static void main(String[] args) {

        int num = 0;

        for (int i = 50; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(" -> " + i);
            }
        }
    }
}
