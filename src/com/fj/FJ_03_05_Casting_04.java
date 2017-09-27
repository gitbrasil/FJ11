/**
 * Cap 03 - Variaveis
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_05_Casting_04 {

    public static void main(String[] args) {

        double d = 5;
        float f = 3;
        
        float x = f + (float) d;
        
        System.out.println("double d = 5;");
        System.out.println("float f = 3;\n");
        System.out.println("float x = f + d; \t\t// não compila");
        System.out.println("float x = f + (float) d; \t// compila \n");
        System.out.println(x);

    }

}
