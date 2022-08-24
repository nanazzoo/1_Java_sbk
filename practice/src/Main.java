import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>45) {
			System.out.print(H + " ");
			System.out.print((M-45));
		} else {
			System.out.println((H-1)+ ":" + (60-(45-M)));
		}
		
		sc.close();
		
	}

}
