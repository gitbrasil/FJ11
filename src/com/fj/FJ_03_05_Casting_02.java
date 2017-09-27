/**
 * Cap 03 - Variaveis
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_05_Casting_02 {

    public static void main(String[] args) {

        long x = 10000;
        int i = (int) x;

        System.out.println("long x = 10000;\n");
        System.out.println("int i = x; \t// não compila");
        System.out.println("int i = (int) x; // compila \n");
        System.out.println(i);

    }

}
