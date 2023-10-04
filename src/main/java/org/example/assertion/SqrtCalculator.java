package org.example.assertion;

public class SqrtCalculator {
    public static void main(String[] args) {
        SqrtCalculator sq = new SqrtCalculator();

        // If someone enters negative number we'll get Exception or Nan (Not a Number)
        System.out.println(sq.sqrt2(625));
        System.out.println(sq.sqrt2(12));
        System.out.println(sq.sqrt2(25));
    }

    public double sqrt1(int x) {
//        return Math.sqrt(x);
        if (x < 0) {
            throw new IllegalArgumentException("Negative number in sqrt1(): " + x);
        } else {
            return Math.sqrt(x);
        }
    }

    // Before using assert you should turn on it on Run > Run Configurations > Arguments and write there -ea
    // After checking it, fixing the code, you should close assert on the same configurations by deleting -ea

    public double sqrt2(int x) {
        assert x >= 0 : "Negative number in sqrt2(): " + x;
//        assert x >= 0 : f2(x);
        return Math.sqrt(x);
    }

    private String f1(int x) {
        return "Negative number in f1(): " + x;
    }

    private StringBuffer f2(int x) {
        return new StringBuffer("Negative number in f2(): " + x);
    }
}
