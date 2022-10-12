package assessment1;

public class AvgOfNums {

	public static void main(String[] args) {
		
		double nums[] = {10,90.78,111,8989,7876};
		double sum = 0;
		double avg = 0;
		
        System.out.println("Given Numbers:");
		
		for(double i:nums)
			System.out.println(i);
		
		for(int i=0;i<nums.length;i++)
		{
			sum=sum+nums[i];
		}
		
		avg = sum/nums.length;
		
		System.out.println("\nAverage of given numbers is: "+avg);

	}

}
