package interface_demo;

public class Cat implements Animal, Animal2 {
    @Override
    public void eat() {
        System.out.println("Cat Like Milk");
    }

    @Override
    public void run() {
        System.out.println("Cat can run fast");
    }
}

