/**
 * fors encadeados
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_13_Ex08 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= i * i; j += i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.exit(0);
    }
}
