package javaprograms;

public class palindrome {

	public static void main(String[] args) {
		int n = 12;
		int r,i,sum = 0;
		int temp;
		temp = n;
		
		while(n>0) {
			r = n % 10;
			sum = sum*10 + r;
			n = n/10;		
		}
		if(temp == sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}

}
