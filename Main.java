package helloWorld; 

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
			
//	ODD EVEN Numbers	
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				System.out.println(i + ":an even number");
			}else {
				System.out.println(i + ":an odd number");
			}
		}
		
// Star Pyramid		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
// Palindrome
//		String x = "level";
		
	}

}