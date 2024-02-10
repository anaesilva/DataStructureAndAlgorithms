package com.datastructure.vetor;

public class testEx02 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        try {

            vetor.addElements("element 1");
            vetor.addElements("element 2");
            vetor.addElements("element 3");
//            vetor.addElements("element 4");

            System.out.println(vetor);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}