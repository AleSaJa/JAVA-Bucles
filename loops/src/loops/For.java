package loops;
import java.util.Scanner;
import java.lang.String;

public class For {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.nextLine();
		s.close();
		System.out.println("Your Name is:");
		for(int i=0; i< name.length() ;i++) {
			System.out.print(name.charAt(i)+" ");
		}
		
	}

}
