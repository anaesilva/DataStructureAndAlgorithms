package com.datastructure.arrays.lorraine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Arrays {

    private String[] elements;
    private int lengthWithoutNullElements;

    public Arrays(int capacity) {
        this.elements = new String[capacity];
        this.lengthWithoutNullElements = 0;
    }

    public void addElement(String element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == null) {
              this.elements[i] = element;
              break;
            }
        }
    }

    public void addElementV2(String element) throws Exception {
        if (this.lengthWithoutNullElements < this.elements.length) {
           this.elements[this.lengthWithoutNullElements] = element;
           this.lengthWithoutNullElements++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }

    public boolean addElementV3(String element) {
        if (this.lengthWithoutNullElements < this.elements.length){
            this.elements[this.lengthWithoutNullElements] = element;
            this.lengthWithoutNullElements++;
            return true;
        }
        return false;
    }

    public boolean addElementV4(int position, String element) {
        if (!(position >= 0 && position < lengthWithoutNullElements)) {
            throw new IllegalArgumentException("Posição inválida");
        }


        
        return false;
    }

    public String find(int position) {
        if (!(position >= 0 && position < lengthWithoutNullElements)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elements[position];
    }

    public int findV2(String element) {
      for (int i = 0; i < this.lengthWithoutNullElements; i++) {
          if (this.elements[i].equals(element)) {
              return i;
          }
      }
      return -1;
    }

    public int lengthResult() {
        return this.lengthWithoutNullElements;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i<this.lengthWithoutNullElements -1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.lengthWithoutNullElements >0){
            s.append(this.elements[this.lengthWithoutNullElements -1]);
        }

        s.append("]");
        return s.toString();
    }
}
