/**
 * Numeros pares e impares
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

import java.util.Scanner;

public class FJ_03_13_Ex07_B {

    public static void main(String[] args) {

        // variavies
        int num = 0;
        int count = 0;

        // obter entrada
        Scanner leitor = new Scanner(System.in);

        // ler num do usuario
        System.out.print("Informe um num.: ");
        num = leitor.nextInt();

        // repetir fluxo
        while (num != 0) {

            // selecionar fluxo
            if (num % 2 == 0) {
                System.out.print(num + " -> ");
                //
            } else if (num == 1) {
                System.out.print(num);
                //
            } else if (count < 1) {
                // calcular impar ( x = 3 * 1 + 1) conforme exerc
                num = 3 * num + 1;
                System.out.print(num + " -> ");
                //
            } else {
                // mostrar num impar
                System.out.print(num + " -> ");
                // calcular impar ( x = 3 * 1 + 1) conforme exerc
                num = 3 * num + 1;
                //
                System.out.print(num + " -> ");
            }
            num /= 2;   // atualizar fluxo while
            count++;
        }
        System.out.println("");
    }
}
