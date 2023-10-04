package org.example.overriding;

import org.example.overriding.employees.*;

public class HRForManagers3 extends HR {
    @Override
    public Employee getAnEmployee(int no) throws NoSuchManagerException {
        Manager m;

        switch (no) {
            case 0 -> m = new Manager(1, "Ali the Manager", 12, "Production");
            case 1 -> m = new Director(6, "Salih the Director", 26, "Management", "Management", 5000);
            default -> throw new NoSuchManagerException("no: " + no);
        }
        return m;
    }
}
