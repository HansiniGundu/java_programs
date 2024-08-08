package javaprograms;

public class implementingstandardmethods  {
    public static void main(String[] args) {
      
        double number = 16.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);

       
        String s = "Hello, World!";
        String upperCaseString = s.toUpperCase();
        String lowerCaseString = s.toLowerCase();
        
        System.out.println("Uppercase String: " + upperCaseString);
        System.out.println("Lowercase String: " + lowerCaseString);

       
        int length = s.length();
        System.out.println("The length of the original string is: " + length);
    }
}
