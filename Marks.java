package assessment1;

public class Marks {

	public static void main(String[] args) {
		
		int marks[]= {78,12,89,55,35};
		
        System.out.println("Given Marks:");
		
		for(int i:marks)
			System.out.println(i);
		
		System.out.println("\nMarks above 80 in given marks:");
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>80)
				System.out.println(marks[i]);
		}

	}

}
