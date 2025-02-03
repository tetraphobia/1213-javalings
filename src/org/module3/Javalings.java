package org.module3;

import java.util.ArrayList;

/*
 * Static methods can be called without needing to instantiate
 * a class. Fix the method header for this `run` method so that it can
 * be called in the main function of the Javalings class.
 */
class StaticMethods {
    public void run(){
        System.out.println("StaticMethods passed.");
    }
}

/*
 * The method's return type determines the type of value it returns,
 * obviously. If you declare a method `int myMethod()`, then `mymethod`
 * will return an int value. If you declare it as `void myMethod()`, it
 * will return no value. Notice the usage of this `run` function in the
 * main function of the Javalings class. Fix the body and return type of this method.
 */
class ReturnTypes {
    public static void run() {
        System.out.println("ReturnTypes");
    }
}

/*
 * Method arguments need types just like variables do. Set the correct types
 * for each of these method arguments.
 */
class MethodParams {
    public static void run(myString, myInt) {
        System.out.println(myString + "passed.");
    }
}

/*
 * Fields also need types. Look at the constructor for this class
 * to determine the correct type for each field.
 */
class Fields {
    a;
    b;
    c;

    public Fields(int a, String b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void run(){
        System.out.println("Fields passed.");
    }
}

/*
 * Variables, fields, and arguments should only have the type in
 * front of their names on declaration.
 */
class OmitType {
    public static void run(int a){
        int b = 5;
        int c = int a + int b;
        System.out.println("OmitType passed.");
    }
}

/*
 * Constructors must be public if you intend to instantiate your class
 * in another class.
 */
class PublicConstructor {
    int a;

    private PublicConstructor(){
        System.out.println("PublicConstructor passwd.");
    }
}

/*
 * Know the differences between primitives and reference types. How would you create
 * an ArrayList of numbers? Remember that ArrayLists can only contain objects.
 */
class PrimitivesAndReferences {
    public static void run() {
        ArrayList<int> a = new ArrayList<int>();
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println("PrimitivesAndReferences passed.");
    }
}

/*
 * Remember the relationship between a parent and child class.
 * Child classes can be treated as parent classes, but parent classes cannot
 * be treated as child classes.
 */
class Vehicle { }
class Car extends Vehicle{
    public static void run() {
        ArrayList<Car> a = new ArrayList<Car>();

        a.add(new Car());
        a.add(new Car());
        a.add(new Vehicle());
        System.out.println("Car passed.");
    }
}

/*
 * All objects stored in an ArrayList are treated like
 * the type of object the ArrayList was instantiated with.
 * Regardless of what objects you store in an ArrayList, parent classes
 * do not have access to the methods of their children.
 * 
 * Solve this problem by type casting each object and calling the `aMethod` method.
 */
class Parent {
}

class Child extends Parent {
    public void aMethod(){};

    public static void run() {
        ArrayList<Parent> a = new ArrayList<Parent>();
        a.add(new Child());
        a.add(new Child());
        a.add(new Child());
        
        for (Parent element : a) {
            element.aMethod();
        }
        
        System.out.println("Child passed.");
    }
}

// Do not edit anything in this class.
public class Javalings {
    public static void main(String[] args) {
        StaticMethods.run();
        System.out.println(ReturnTypes.run() + " passed.");
        MethodParams.run("MethodParams", 2);
        new Fields(1, "2", 3.0).run();
        OmitType.run(1);
        PublicConstructor a = new PublicConstructor();
        PrimitivesAndReferences.run();
        Car.run();
        Child.run();
    }
}
