package assessment1;

public class FindText {

	public static void main(String[] args) {
		
		String tech[] = {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		System.out.println("Given list of tech:");
		for(String i:tech)
			System.out.println(i);
		
		System.out.println("\nTech list until Selenium found:");
		for(String i: tech)
		{
			if(i=="Selenium")
				break;
			System.out.println(i);
		}
			

	}

}
