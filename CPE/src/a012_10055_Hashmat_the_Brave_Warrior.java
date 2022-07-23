import java.util.Scanner;

public class a012_10055_Hashmat_the_Brave_Warrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			long n1 = scanner.nextLong();
			long n2 = scanner.nextLong();
			System.out.println(Math.abs(n1-n2));
		}
		scanner.close();
	}
}
