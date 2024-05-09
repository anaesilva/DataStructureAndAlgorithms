package com.datastructure.arrays.javaloiane;

public class testEx05 {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(10);

            arrays.addElementV3("element 1");
            arrays.addElementV3("element 2");
            arrays.addElementV3("element 3");

            System.out.println(arrays.find(2));
    }
}