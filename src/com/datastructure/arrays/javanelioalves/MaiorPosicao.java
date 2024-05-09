package com.datastructure.arrays.javanelioalves;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        double[] vet = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º" + "numero: ");
            vet[i] = scanner.nextDouble();
        }


        double maior = 0;
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            if(vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);


        scanner.close();
    }
}
