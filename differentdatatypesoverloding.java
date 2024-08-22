package javapractice;

public class differentdatatypesoverloding {
	
	public void method(int number,String message) {
		System.out.println("Integer: " + number + ", String: " + message);
	}
	
	public void method(double number, boolean flag) {
        System.out.println("Double: " + number + ", Boolean: " + flag);
    }
	
	public void method(char character, double number) {
        System.out.println("Character: " + character + ", Double: " + number);
    }

	public static void main(String[] args) {
		differentdatatypesoverloding myObj = new differentdatatypesoverloding();
		
		myObj.method(10,"Hello");
		myObj.method(3.14,true);
		myObj.method('H',10.0);
		
		
	}

}
