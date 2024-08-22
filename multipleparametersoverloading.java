package javapractice;

public class multipleparametersoverloading {
	
	public void display(int num1,int num2) {
		System.out.println("Two integer parameters: " + num1 + " and " + num2);
	}
	
	public void display(double num1,double num2) {
		System.out.println("Two double parameters: " + num1 + " and " + num2);
	}
	
	public void display(String str1,String str2) {
		System.out.println("Two String parameters: " + str1 + " and " + str2);
	}

	public static void main(String[] args) {
		
		multipleparametersoverloading myObj = new multipleparametersoverloading();
		
		myObj.display(5,10);
		myObj.display(25.0,15.0);
		myObj.display("Hello","Java");

	}

}
