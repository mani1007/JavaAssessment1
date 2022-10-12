package assessment1;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		System.out.println("Before Swap:\n"+"a: "+a+"\nb: "+b);
		
		// With temp Variable
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		/* Without temp Variable
		a=a+b;
		b=a-b;
		a=a-b;  */
		
		System.out.println("\nAfter Swap:\n"+"a: "+a+"\nb: "+b);

	}

}
