import java.util.Scanner;

public class e566_10190_Divide_But_Not_Quite_Conquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			long n = scanner.nextLong();
			long m = scanner.nextLong();
			int ismultiple = 1;
			
			while(n>ismultiple && m>=2)
				ismultiple *= m;
			
			if(ismultiple == n) {
				for(long i=n;i>=1;i/=m) {
					System.out.print(i);
					if(i!=1) 
						System.out.print(" ");
				}
				System.out.println("");
			}else {
				System.out.println("Boring!");
			}
		}
		scanner.close();
	}
}
//while(scanner.hasNext()) {
//long n = scanner.nextLong();
//long m = scanner.nextLong();
//int ismultiple = 1;
//
//while (ismultiple < n && m >= 2)
//	ismultiple *= m;
//
//if (ismultiple == n && m >= 2 && n >= m) {//ismultiple == n 確認n數m的倍數
//	
//	for (long i = n; i >= 1; i /= m) {
//		System.out.print(i);
//		
//		if (i != 1)//note for that
//			System.out.print(" ");
//    }
//	
//    System.out.println();
// }else
//    System.out.println("Boring!");
//}	