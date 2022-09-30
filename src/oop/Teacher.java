package oop;

public class Teacher extends Person{
    //Method Overriding
    @Override
    void displayPersonInfo() {
        System.out.println("This method is executed from Teacher Class");
    }
}
