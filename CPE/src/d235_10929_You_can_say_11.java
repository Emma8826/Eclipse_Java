import java.util.Scanner;
import java.math.BigInteger;

public class d235_10929_You_can_say_11 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			long num1 = scanner.nextLong();
			if(num1==0)
				break;
			if(num1%11 == 0) 
				System.out.printf("%d is a multiple of 11.\n",num1);
			else
				System.out.printf("%d is not a multiple of 11.\n",num1);
		}
		scanner.close();
	}
}

//Scanner scanner = new Scanner(System.in);
//BigInteger num = new BigInteger("11"); 
//
//while(scanner.hasNext()) {
//	String str = scanner.next();
//	BigInteger a = new BigInteger(str);//將string轉成數字
//	BigInteger b = a.mod(num);
//	
//	if(str.equals("0"))//equals裡要是string
//		break;
//	
//	if(b==BigInteger.ZERO)//after mod is zero
//		System.out.printf("%s is a multiple of 11.\n",str);
//	else
//		System.out.printf("%s is not a multiple of 11.\n",str);
//	
//}