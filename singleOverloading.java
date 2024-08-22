package javapractice;

public class singleOverloading {

    public void display(int num) {
        System.out.println("Integer parameter: " + num);
    }
    
    public void display(String str) {
        System.out.println("String parameter: " + str);
    }

    public static void main(String[] args) {  
        singleOverloading myOBJ = new singleOverloading();
        
        myOBJ.display(10);             
        myOBJ.display("Hello");    
    }
}
