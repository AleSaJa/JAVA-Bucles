package loops;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        System.out.println("Multiplication Table of " + num);
        int i=0;
        while(i<=10) {
        	System.out.println(String.format("%s x %s = %s", num,i,num*i));
        	i++;
        }
        
        console.close();
       //TODO implement While loop to get print result	
        }

}
