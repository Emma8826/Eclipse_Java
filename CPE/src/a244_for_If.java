import java.util.Scanner;
public class a244_for_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		while(cases-- != 0) {
			int a = scanner.nextInt();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			switch(a){
				case 1:
					System.out.println(b+c);
					break;
				case 2:
					System.out.println(b-c);
					break;
				case 3:
					System.out.println(b*c);
					break;
				case 4:
					System.out.println(b/c);
					break;
			}
		}
		scanner.close();
	}

}
