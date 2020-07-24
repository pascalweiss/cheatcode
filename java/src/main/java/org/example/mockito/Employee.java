package org.example.mockito;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee {

    private String name;

    private Database database;

    public String getSalary() {
        Double salary = database.querySalary(name);
        return String.format("Salary: %f", salary);
    }
}
