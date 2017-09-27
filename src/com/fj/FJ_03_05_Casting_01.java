/**
 * Cap 03 - Variaveis
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_05_Casting_01 {

    public static void main(String[] args) {

        double d = 3.1415;
        int i = (int) d;

        System.out.println("double d = 3.1415;\n");
        System.out.println("int i = d; \t// não compila");
        System.out.println("int i = (int) d; // compila \n");
        System.out.println(i);

    }

}
