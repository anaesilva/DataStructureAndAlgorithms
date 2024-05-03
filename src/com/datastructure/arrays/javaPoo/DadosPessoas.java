package com.datastructure.arrays.javaPoo;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double menorAltura = 0, maiorALtura = 0, total = 0;
        int qdeM = 0, qdeF = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "º" + " pessoa: ");
            alturas[i] = scanner.nextDouble();

            System.out.println("Genero da " + (i + 1) + "º" + " pessoa: ");
            generos[i] = scanner.next().charAt(0);

            menorAltura = alturas[0];
            maiorALtura = alturas[0];

            if (alturas[i] > maiorALtura) {
                maiorALtura = alturas[i];
            } else if (alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }

            if (generos[i] == 'F') {
                qdeF++;
                total+= alturas[i];
            } else {
                qdeM++;
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorALtura);

        double media = total /qdeF;

        System.out.printf("Media das alturas das mulheres = %.2f\n", media);

        System.out.println("Numero de homens = " + qdeM);

        scanner.close();
    }
}
