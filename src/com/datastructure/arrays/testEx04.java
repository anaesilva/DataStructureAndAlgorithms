package com.datastructure.arrays;

public class testEx04 {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(10);

        try {
            arrays.addElementV2("element 1");
            arrays.addElementV2("element 2");
            arrays.addElementV2("element 3");

            System.out.println(arrays.lengthResult());
            System.out.println(arrays);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}