package javaprograms;

public class constructorwithparameters {
	
	int x;
	 public constructorwithparameters(int y) {
		  x = y;
	 }
	public static void main(String[] args) {
		constructorwithparameters myObj = new constructorwithparameters(10);
		System.out.println(myObj.x);
		
	}

}
