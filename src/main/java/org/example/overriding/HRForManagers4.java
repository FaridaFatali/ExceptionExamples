package org.example.overriding;

// We can't write throws Exception, we can write only NoSuchEmployeeException or it's subclass NoSuchManagerException
public class HRForManagers4 extends HR {

//    @Override
//    public Employee getAnEmployee(int no) throws Exception {
//        Manager m;
//
//        switch (no) {
//            case 0 -> m = new Manager(1, "Ali the Manager", 12, "Production");
//            case 1 -> m = new Director(6, "Salih the Director", 26, "Management", "Management", 5000);
//            default -> throw new Exception("no: " + no);
//        }
//        return m;
//    }
}
