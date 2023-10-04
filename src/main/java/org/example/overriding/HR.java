package org.example.overriding;

import org.example.overriding.employees.*;

public class HR {

    public Employee getAnEmployee(int no) throws NoSuchEmployeeException {
        Employee e = null;
        switch (no) {
            //case 0 -> e = new Employee(1, "Ali", 4, "Production");
            case 1 -> e = new Secretary(2, "Sevim", 9, "Sales", new Manager(3, "Kamil", 17, "Sales"));
            case 2 -> e = new Engineer(4, "Burhan", 5, "Production", "Improving production");
            case 3 -> e = new Manager(5, "Ismail", 14, "Production", "Production");
            case 4 -> e = new Director(6, "Salih", 24, "Management", "Management", 4500);
            default -> throw new NoSuchEmployeeException("no: " + no);
        }
        return e;
    }
}
