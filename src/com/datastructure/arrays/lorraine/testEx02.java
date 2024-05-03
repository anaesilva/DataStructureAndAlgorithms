package com.datastructure.arrays.lorraine;

public class testEx02 {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(3);

        try {
            arrays.addElementV2("element 1");
            arrays.addElementV2("element 2");
            arrays.addElementV2("element 3");

            System.out.println(arrays);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}