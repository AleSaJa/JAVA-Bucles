package loops;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		s.close();
		int a=0;
        int b=0;
        int result=1;

        int cont = 1;

        System.out.println("0");
        System.out.println("1");
        do {
            a=b;
            b=result;
            result=a+b;
            System.out.println(result);
            cont++;
        }while(cont<n);

	}

}
