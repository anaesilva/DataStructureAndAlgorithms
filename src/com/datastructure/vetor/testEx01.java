package com.datastructure.vetor;

public class testEx01 {
    public static void main(String[] args) {
       Vetor vetor = new Vetor(5);

       vetor.addElement("element 1");
       vetor.addElement("element 2");
       vetor.addElement("element 3");
       vetor.addElement("element 4");

       System.out.println(vetor);
    }
}