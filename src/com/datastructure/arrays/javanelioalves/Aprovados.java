package com.datastructure.arrays.java;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        double[] semestreUm = new double[n];
        double[] semestreDois = new double[n];

        double media;

        for(int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º" + " aluno: ");
            nomes[i] = scanner.next();

            semestreUm[i] = scanner.nextDouble();

            semestreDois[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < n; i++) {
            media = (semestreUm[i] + semestreDois[i])/2;

            if (media >= 6) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

    scanner.close();
    }
}
