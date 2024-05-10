package com.datastructure.matriz.javanelioalves;

import java.util.Arrays;
import java.util.Scanner;

public class LendoDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite o número que você quer procurar: ");
        int x = scanner.nextInt();

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                Integer left = null;
                Integer right = null;
                Integer down = null;
                Integer up = null;

                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        System.out.println();



        scanner.close();
    }
}
