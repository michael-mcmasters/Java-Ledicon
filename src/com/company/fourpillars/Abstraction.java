package com.company.fourpillars;

// Abstraction means using simple things to represent complexity.
// In Java, abstraction means simple things like objects, classes,
// and variables represent more complex underlying code and data.
// This is important because it lets us avoid repeating the same work multiple times.
// It handles complexity by hiding unnecessary details from the user

public class Abstraction {

    public void doThing() {
        // Here, we don't care how the calculation is done. We abstract it away. We only care that it gets done.
        String result = doThingComplexively();
    }

    private String doThingComplexively() {
        // Complicated calculation
        return "result";
    }

}
