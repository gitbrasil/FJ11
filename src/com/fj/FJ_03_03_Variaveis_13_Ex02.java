/**
 * Cap 03 - Variaveis
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_03_Variaveis_13_Ex02 {

    public static void main(String[] args) {
        // variaves
        double gastosJaneiro = 15000;
        double gastosFevereiro = 23000;
        double gastosMarco = 17000;
        double gastosTrimestre = 0;

        // exibir
        System.out.println("Janeiro \t: " + gastosJaneiro);
        System.out.println("Fevereiro \t: " + gastosFevereiro);
        System.out.println("Marco \t\t: " + gastosMarco);

        // calcular
        gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        // exibir
        System.out.println("\nGastos do trimestre: " + gastosTrimestre);
        System.out.println("\nGastos medio mensal: " + (gastosTrimestre / 3));

        
        System.out.printf("\nGastos medio mensal: %.2f", (gastosTrimestre / 3));
    }

}
