# Core-Java

There are four pillars in Java. Those are;

1. Inheritance

2. Polymorphism

3. Encapsulation

4. Abstraction

In this article, I am going to give a brief introduction to each concept.

1.Inheritance

In inheritance, you can create a new class that is inherited by another class. So the new class we can refer to as a child class or subclass and the class which already exists refer to a parent or superclass. One object acquires all the behaviors and properties of a parent object, and when you inherit a child class from a parent class you can reuse fields and methods of that class.


Syntax of inheritance
Parent Class{

}

class Child extends Parent

{

//methods and fields

}

A real-world example of inheritance is all the properties of the father inherited by his son.

Advantages: Code reusability; Application performance is enhanced.

Note: Multiple inheritances are not allowed by Java.

2.Polymorphism

Simply we can define this concept as this, “having many forms”. We can simply explain this concept using a person because a person can be many things at the same time. He can be a father, an employer, a husband, etc.

Method overriding

class Overriding{
void eat() {System.out.println (“She is eating”);}
}
class Overriding1 extends Overriding{
void eat(){System.out.println("He is eating");}
public static void main (String args[]){
Overriding1 obj = new Overriding1();
obj.eat();
}
}
Method overloading

If a class has multiple methods that have the same name but with different parameters, it is “method overloading”. Method overloading can be done in the following ways.

By changing the number of arguments
By changing the data type
class Sum {
static int add(int a, int b){return a+b;}
static int add(int a,int b,int c){return a+b+c;}
}
class MethodOverloading{
public static void main(String[]args){
System.out.println(Sum.add(12,12));
System.out.println(Sum.add(115,126,223));
}}
Advantages: Flexibility; Code reusability

3.Encapsulation

Encapsulation is also known as “data hiding”. This will wrap the code and data into a single unit and be better for unit testing.

public class Encap{
private String name;
private String college;
private int contactNo;

public int get contactNo() {
return contactNo;
}

public String getName() {
return name;
}

public String getCollege() {
return college;
}

public void setAge( int newcontactNo) {
contactNo = newcontactNo;
}

public void setName(String newName) {
name = newName;
}

public void setCollege( String newCollege) {
college = newCollege;
}
}
Advantages: Security; Code reusability

4.Abstraction

Abstraction is used to hide the implementation and it will show only the functionality to the user.

abstract class {
abstract void walk()
}
class Child extends Human{
void walk(){
System.out.println("Walking slowly");
}
public static void main (String args[])
Child obj= new Human();
obj.walk();
}
}
Advantages: Code reusability; Enhancement is easy; Maintainability; Security