package com.datastructure.vetor;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter

public class Vetor {

    private String[] elements;
    private int lengthTotal;

    public Vetor(int capacidade) {
        this.elements = new String[capacidade];
        this.lengthTotal = 0;
    }

    public void addElement(String element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == null) {
              this.elements[i] = element;
              break;
            }
        }
    }

    public void addElements(String element) throws Exception {
        if (this.lengthTotal < this.elements.length) {
           this.elements[this.lengthTotal] = element;
           this.lengthTotal++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, elements.length));
    }



}
