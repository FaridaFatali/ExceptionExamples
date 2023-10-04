package org.example.ex;

public class Human {
    public static void main(String[] args) {

        // We can't write first parent class then subclasses
        // We should write specific subclasses first, then the parent classes
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.err.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.err.println("Caught Annoyance");
        } catch (Exception e) {
            System.err.println("Caught Exception");
        }
    }
}

class Annoyance extends Exception {

}

class Sneeze extends Annoyance {

}
