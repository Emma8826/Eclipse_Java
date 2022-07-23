import java.util.Scanner;

public class c014_10035_Primary_Arithmetic {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int carrynum = 0;
			int sum = 0;
			
			if(n1==0&&n2==0)
				break;
			
			while(n1!=0||n2!=0) {
				if((n1%10+n2%10+carrynum)>=10) {
					carrynum = 1;
					sum++;
				}else { 
					carrynum = 0;
				}
				n1/=10;
				n2/=10;		
			}
			
			if(sum==0) 
				System.out.println("No carry operation.");
			else if(sum==1)
				System.out.println("1 carry operation.");
			else if(sum>=2) 
				System.out.println(sum+" carry operations.");
		}
	}
}
//Scanner scanner = new Scanner(System.in);
//while(scanner.hasNext()){
//	int carry = 0;//進位
//	int cases = 0;//總共發生了幾次進位
//	int n1 = scanner.nextInt();
//	int n2 = scanner.nextInt();
//	if(n1==0&&n2==0)
//		break;
//	while(n1!=0||n2!=0) {
//		if(n1%10+n2%10+carry>=10) {
//			cases++;
//			carry=1;
//		}else {
//			carry=0;
//		}
//		n1/=10;
//		n2/=10;	
//	}
//	if(cases==0) {
//		System.out.println("No carry operation.");
//	}else if(cases==1){
//		System.out.println("1 carry operation.");
//	}else if(cases>=2) {
//		System.out.println(cases+" carry operations.");
//	}
//		
//}
//scanner.close();