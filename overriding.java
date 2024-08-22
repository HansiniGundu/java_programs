package javapractice;


class Pet {
 void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

class Cat extends Pet {
 @Override
 void makeSound() {
     System.out.println("Meow! Meow!");
 }
}

public class overriding {
 public static void main(String[] args) {
     
     Pet animal = new Pet();
     Pet cat = new Cat(); 

     animal.makeSound(); 
     cat.makeSound();     
 }
}
