// Good site with a simple chart which shows what classes/interfaces/methods can use which access modifiers:
// http://tutorials.jenkov.com/java/access-modifiers.html

// Public: Class, Package, Subclass, Global, Variable
// Protected: Class, Package, Subclass
// Default: Class, Package
// Private: Class, Variable

// Packages can have all 4 access modifiers.
private package com.company.fouraccessmodifiers;

// Classes must always be public. Unless they're a child class, in which they can be protected.
public class AccessModifiers {

    // Nested classes can be protected or private.
    protected class NestedClassOne { }
    private class NestedClass2 { }


    public void doSomething1() {

    }
    private void doSomething3() {

    }
    protected void doSomething2() {

    }

    // Default methods only go in interfaces (and abstract classes maybe?)
}


interface Inter {

    public void publicMethod();  // Can't have body. Must be inherited. (It's Abstract.)

    private void privateMethod() {
        // Must have body. Can't be inherited. (It's private and used for this interface only.)
    }

    default void defaultMethod() {
        // Must have body. Can be inherited. (Inheriting is optional.)
    }

        // protected methods don't exist for interfaces.
}

// Subclasses can be protected.
protected class SubClass implements Inter {

    // Have to override this
    @Override
    public void publicMethod() {
        defaultMethod();
    }

    // Overriding default methods is optional. But you must use the "public" access modifier if doing so.
    @Override
    public void defaultMethod() {

    }
}