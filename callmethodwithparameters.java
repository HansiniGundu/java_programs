package javaprograms;

public class callmethodwithparameters {
		
		public static int add(int num1, int num2) {
	        return num1 + num2;
	        
	    
	}
		
		public static int multiply(int num1, int num2) {
	        return num1 * num2;
	        
	    
	}
		
		public static void main(String[] args) {
			 int num1 = 5;
		     int num2 = 7;   
		     int result1 = add(num1,num2);	
		     int result2 = multiply(num1,num2);
		     System.out.println("The sum of " + num1 + " and " + num2 + " is : " + result1);
		     System.out.println("The multiplication of " + num1 + " and " + num2 + " is : " + result2);
		}
			

}

