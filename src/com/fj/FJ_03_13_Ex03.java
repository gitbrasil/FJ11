/**
 * Imprima todos os múltiplos de 3, entre 1 e 100
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_13_Ex03 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Multiplo de 3: " + i);
            }

        }

    }
}

