package oop;

public class Polymorphism {
    public static void main(String[] args) {
        MethodOverLoading object = new MethodOverLoading();
        MethodOverLoading object2 =new MethodOverLoading(5,5);//This will print 10
        System.out.println(object.add());//This will print 50.0
        System.out.println(object.add(6,5));//This will print 11.0
//
    }
}
//Method Overloading
class MethodOverLoading{
    int value1,value2;

    MethodOverLoading(){
        System.out.println("This is a Default Constructor");
    }
    MethodOverLoading(int a, int b){
        this.value1=a;
        this.value2=b;
        System.out.println(value1+value2);

    }
    MethodOverLoading(int a,int b,int c){
        System.out.println(a+b+c);
    }

    float add(){
        return 50;
    }
    float add( int a, int b){
        return (a+b);
    }
    float add(int a,int b,int c){
        return (a+b+c);
    }
}
