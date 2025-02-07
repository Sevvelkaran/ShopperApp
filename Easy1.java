
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Easy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File file = new File("imput.txt");
			Scanner sc = new Scanner(System.in);

			int size = sc.nextInt();
			int arr[] = new int[size];

			for(int i =0;i<size;i++){
				arr[i] = sc.nextInt();
			}
			int odd = 0;
			int even =0;

			for(int i =0; i<size;i++){
				if(arr[i] % 2 ==0 ){
					even++;
				}
				else{
					odd++;
				}
			}
			System.out.println("even" + even + "odd" + odd);
		}
		catch (FileNotFoundException e ){
			System.out.println("Error : File not found");
			e.printStackTrace();
		}
		
	}

}
