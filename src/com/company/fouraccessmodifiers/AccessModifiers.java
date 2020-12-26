// Good site with a simple chart which shows what classes/interfaces/methods can use which access modifiers:
// http://tutorials.jenkov.com/java/access-modifiers.html

// Public: Class, Package, Subclass, Global, Variable
// Protected: Class, Package, Subclass
// Default: Class, Package
// Private: Class, Variable

// public: Any class can access it.
// protected: Only classes in the same package, and subclasses even if they're in another package, can access it.
// default: Only classes in the same package can access it. (Not subclasses in another package.)
// private: Only this class can access it.

// Packages can have all 4 access modifiers (I think. Changed it to nothing because I was getting run-time errors.)
package com.company.fouraccessmodifiers;

// Classes must always be public. Unless they're a child class, in which they can be protected.
public class AccessModifiers {

    // Nested classes can be protected, private, or public. Not default.
    protected class NestedClassOne { }
    private class NestedClass2 { }
    public class NestedClass3 { }

    // If you give no access modifier, it automatically assigns it to default. Meaning only classes in the same package can access it.
    int number;
    void doSomething() {

    }
    // Note that you can't explicity type "default int number;" or "default void doSomething() { }"
    // You have to just write "int number;" or "void doSomething()" and it is put in automatically.

    public void doSomething1() {

    }
    private void doSomething3() {

    }
    protected void doSomething2() {

    }
}


interface Inter {

    // Properties can only be default or public. Child class can access them.
    int number1 = 1;
    public int number2 = 2;



    // Is abstract. Can never have body and must be inherited.
    public void publicMethod();

    // Use default to put behaviour in an interface. (Must write default in interfaces.)
    // Inheritance is optional.
    // Works like a public method in a regular class.
    default void defaultMethod() {

    }

    // Private function only for this class. Can't be inherited.
    private void privateMethod() {
    }

    // protected methods don't exist for interfaces.
}

// Subclasses can be protected (I think. But can't show that with two classes in same file.)
class SubClass implements Inter {

    // Have to override this
    @Override
    public void publicMethod() {
        defaultMethod();
    }

    // Can override this. It's optional for default methods.
    // If you do override a default method you must make the override public.
    @Override
    public void defaultMethod() {

    }
}