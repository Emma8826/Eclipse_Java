import java.util.Scanner;
public class d255_11417_GCD {//有給公式
	public static int gcd(int a,int b) {
		 if (b==0) 
			   return a;
		 return gcd(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int num = scanner.nextInt();
			int sum = 0;
			if(num==0)
			for(int i=1;i<num;i++) {
				for(int j=i+1;j<=num;j++) {
					sum += gcd(i,j);
				}
			}
			System.out.println(sum);
		}
	scanner.close();
	}
}
