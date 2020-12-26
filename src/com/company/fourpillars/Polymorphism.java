package com.company.fourpillars;

// SAME NAME, MANY FORMS. This Java OOP concept lets programmers use the same word to mean different things in different contexts.
// One form of polymorphism in Java is method overloading. That’s when different meanings are implied by the code itself.
// The other form is method overriding. That’s when the different meanings are implied by the values of the supplied variables.
//
//        TWO TYPES:
//        Runtime , Polymorphism handled during runtime: example (Overriding)
//        Static , Polymorphism handled in the compiler: example (Overloading)

// Using overloading
public class Polymorphism {

    public void doThing(int args) {

    }

    public void doThing(String args) {

    }

}

// Using overriding
class Parent {

    public void doThing() {

    }
}

class Child extends Parent {

    @Override
    public void doThing() {

    }
}
