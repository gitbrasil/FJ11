/**
 * Cap 03 - If & Else
 * set 26, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.fj;

public class FJ_03_09_For_Loop {

    public static void main(String[] args) {
        // 
        int y = 0;
        int x = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um num. divisivel por 19 entre 0 e 100: " + i);
            }
        }

    }

}
