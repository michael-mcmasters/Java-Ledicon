package com.company.fourpillars;

//This is a special feature of Object Oriented Programming in Java. It lets programmers create new classes that share
// some of the attributes of existing classes. This lets us build on previous work without reinventing the wheel.
//    * The ability for a sub class to access the super class's members implicitly through the keyword `extends`;
//    Members include methods as well as variables.

public class Inheritance {

    public int number = 4;
    public void doSomething() {

    }
}

class ChildClass extends Inheritance {

    @Override
    public void doSomething() {
        System.out.println(number);
    }
}
