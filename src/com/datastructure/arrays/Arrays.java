package com.datastructure.arrays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Arrays {

    private String[] elements;
    private int lengthNotNull;

    public Arrays(int capacity) {
        this.elements = new String[capacity];
        this.lengthNotNull = 0;
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
        if (this.lengthNotNull < this.elements.length) {
           this.elements[this.lengthNotNull] = element;
           this.lengthNotNull++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }

    public boolean addElementV3(String element) {
        if (this.lengthNotNull < this.elements.length){
            this.elements[this.lengthNotNull] = element;
            this.lengthNotNull++;
            return true;
        }
        return false;
    }

    public boolean addElement(int position, String element) {
        if (!(position >= 0 && position < lengthNotNull)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        
        return false;
    }

    public String find(int position) {
        if (!(position >= 0 && position < lengthNotNull)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elements[position];
    }

    public int findV2(String element) {
      for (int i = 0; i < this.lengthNotNull; i++) {
          if (this.elements[i].equals(element)) {
              return i;
          }
      }
      return -1;
    }

    public int lengthResult() {
        return this.lengthNotNull;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i<this.lengthNotNull -1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.lengthNotNull >0){
            s.append(this.elements[this.lengthNotNull -1]);
        }

        s.append("]");
        return s.toString();
    }
}
