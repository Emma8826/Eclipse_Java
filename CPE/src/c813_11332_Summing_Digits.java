import java.util.Scanner;
public class c813_11332_Summing_Digits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			long num = scanner.nextLong();
			if(num==0)
				break;
			
			while(num/10 != 0) 
				num = num/10+num%10;
			
			System.out.println(num);
		}
	}
}
//Scanner scanner = new Scanner(System.in); 
//
//while(scanner.hasNext()) {
//	long num = scanner.nextLong();
//	if(num==0)//zero is break condition
//		break;
//	
//	while(num/10 != 0) {
//		num = num/10+num%10;
//	}
//	
//	System.out.println(num);
//}

//Scanner scanner = new Scanner(System.in);
//while(scanner.hasNext()){
//	String str=scanner.next();
//	if(str.equals("0")) 
//		break;
//	
//	//字元相加，加到st長度只有1為止(只有個位數)。
//	int num=0;
//	while(str.length()!=1){
//		for(int i=0;i<str.length();i++){
//			num=num+str.charAt(i)-48;//將整數型數字轉為數字的方法
//		}
//		str=Integer.toString(num);
//		num=0;
//	}
//	//Output
//	System.out.println(str);
//}