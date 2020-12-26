package com.company.fourpillars;

// This is the practice of keeping fields within a class private, then providing access to them via public methods.
// It’s a protective barrier that keeps the data and code safe within the class itself.
// This way, we can re-use objects like code components or variables without allowing open access to the data system-wide.

public class Encapsulation {

    private int number = 4;

    public int getNumber() {
        return 4;
    }

    public void setNumber(int num) {
        number = num;
    }

}
