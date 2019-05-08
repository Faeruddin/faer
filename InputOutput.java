import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner faer = new Scanner(System.in);
		System.out.println("INPUT");
		int pembagi = faer.nextInt();
		System.out.println("OUTPUT");
		for(int i = 0; i < pembagi+2; i++) {
			
			int dibagi = (i)%2;
			if (dibagi==0) {
				
				
				System.out.print(i+" ");
			}
		}
			

	}

}
