/**
 * Números da série de Fibonacci
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_14_Desafio {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        while (num1 < 1000) {
            System.out.println(num1);
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
    }
}
