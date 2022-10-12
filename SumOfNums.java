package assessment1;

public class SumOfNums {

	public static void main(String[] args) {
		
		double nums[] = {10,90.78,111,8989,7876};
		double total=0;
		
        System.out.println("Given Numbers:");
		
		for(double i:nums)
			System.out.println(i);
		
		for(double i:nums)
		{
			total = total+i;
			
		}
		
		System.out.println("\nSum of Given numbers is: "+ total);
	}

}
