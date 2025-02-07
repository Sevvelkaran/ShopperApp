import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
public class Ques_7 {
	public static void main(String args[]) {
		try {
		File file = new File(input.txt);
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the age");
			int age;
			age = sc.nextInt();

	 System.out.println("Enter the weight");
	        int weight;
			weight = sc.nextInt();
			
			if(age>=18 && age <=55 && weight>=45) {
				System.out.println("Eligible to donate");
			}
			else {
				System.out.println("Not eligible");
			}
		}
		catch(FileNotFountException e) {
			System.out.println("The File was not found");
			e.printStackTrace();
			
		}
		
}
}
