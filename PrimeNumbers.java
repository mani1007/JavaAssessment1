package assessment1;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Prime Numbers upto 1000:");
		
		for (int i=2;i<=1000;i++)
		{
			int flag = 1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(i);
		}

	}

}
