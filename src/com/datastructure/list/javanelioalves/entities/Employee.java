package com.datastructure.list.javanelioalves.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    @Override
    public String toString() {
        return + id + ", " + name + ", " + salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }
}
