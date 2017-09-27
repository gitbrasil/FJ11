/**
 * Números da série de Fibonacci
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_13_Ex06 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < 30; i++) {
            System.out.println(num1);
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
    }

}
