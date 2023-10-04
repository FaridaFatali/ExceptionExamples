package org.example.assertion;

public class PrePostConditionsExample {
    public static void main(String[] args) {
        Car car = new Car();

        // Before using assert you should turn on it on Run > Run Configurations > Arguments and write there -ea
        // After checking it, fixing the code, you should close assert on the same configurations by deleting -ea

        assert car.checkStopped();    // Pre-condition check
        car.accelerate(100);
        assert !car.checkStopped();   // Post-condition check

        car.stop();
        assert car.checkStopped();
    }
}

class Car {
    boolean started;
    int speed;

    public void accelerate(int speed) {
        this.speed = speed;
        started = true;
    }

    public void stop() {
        speed = 0;
        started = false;
    }

    public boolean checkStopped() {
//        if (speed > 0 | started) { //Change it to "!started" to see the assertion error.
//            return false;
//        } else {
//            return true;
//        }

        // Or just:
        return !(speed > 0 | started);
    }
}