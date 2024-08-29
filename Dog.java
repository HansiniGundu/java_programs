package java_programs;

public class Dog {
    String name;
    String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Grady", "Brown");
        dog.printDetails();
    }
}

