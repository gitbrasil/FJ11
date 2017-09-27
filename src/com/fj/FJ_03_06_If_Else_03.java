/**
 * Cap 03 - If & Else
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_06_If_Else_03 {

    public static void main(String[] args) {

        int idade = 15;
        boolean amigoDoDono = true;

        if (idade < 18 && amigoDoDono == false) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }

    }

}
