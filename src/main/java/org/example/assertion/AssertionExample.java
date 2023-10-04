package org.example.assertion;

// Before using assert you should turn on it on Run > Run Configurations > Arguments and write there -ea
// After checking it, fixing the code, you should close assert on the same configurations by deleting -ea


public class AssertionExample {
    public static void main(String[] args) {
        int i = 12;

        assert i > 3;

        assert i > 16 : "Must be more than 16";
    }
}
