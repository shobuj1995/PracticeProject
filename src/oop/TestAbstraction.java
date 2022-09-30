package oop;

public class TestAbstraction {
    public static void main(String[] args) {
        MobileUser obj;
        obj = new User1();
        obj.sendMessage();
        obj = new User2();
        obj.sendMessage();
        obj.printNumber();
        }
    }

