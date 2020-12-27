package com.company.fouraccessmodifiers.AbstractClass;

// Can have methods and properties just like a normal class.
// Can also make all methods abstract, except for private methods.
abstract class AbstractClass {

    public int num1 = 1;
    private int num2 = 2;
    int num3 = 3;
    protected int num4 = 4;

    public abstract void aye1();
    //private abstract void aye2();
    protected abstract void aye3();
    abstract void aye4();

    void doSomething1() {

    }
    public void doSomething2() {

    }
    protected void doSomething3() {

    }
    private void doSomething4() {

    }
}
