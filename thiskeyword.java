package javapractice;

class Person {
String name;
int age;
public void getInfo() {
System.out.println("The name of this Person is " + this.name);
System.out.println("The age of this Person is " + this.age);
System.out.println();
}
}
public class thiskeyword {
	
public static void main(String args[]) {
	
Person p1 = new Person();
p1.name = "Honey";
p1.age = 19;
p1.getInfo();

Person p2 = new Person();
p2.name = "Cherry";
p2.age = 14;
p2.getInfo();
}
}