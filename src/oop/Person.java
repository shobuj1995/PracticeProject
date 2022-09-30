package oop;

public class Person {
    int age = 25;
    String name = "jhon";

    void displayPersonInfo(){
        System.out.println("Name: "+name+" age: "+age);


    }
}
class ExecutePerson{
    public static void main(String[] args) {
        Person object = new Person();
        object.displayPersonInfo();//This method will call from person class
        object = new Teacher();
        object.displayPersonInfo();//This method will call from Teacher Class


    }

}
