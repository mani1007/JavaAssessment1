package assessment1;

public class FindNumber {

	public static void main(String[] args) {
		
		int nums[]= {12,34,66,85,900};
		
		System.out.println("Given Numbers:");
		
		for(int i:nums)
			System.out.println(i);
		
		System.out.println("\nNumbers until 85 found:");
		for(int i:nums)
		{
			if (i==85)
				break;
			System.out.println(i);
		}
			

	}

}
