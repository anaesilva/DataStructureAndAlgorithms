package com.datastructure.arrays.javanelioalves;

import com.datastructure.arrays.javanelioalves.entities.Rent;

import java.util.Scanner;

public class RentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n =  sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }

        sc.close();
    }
}
