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
//	//�r���ۥ[�A�[��st���ץu��1����(�u���Ӧ��)�C
//	int num=0;
//	while(str.length()!=1){
//		for(int i=0;i<str.length();i++){
//			num=num+str.charAt(i)-48;//�N��ƫ��Ʀr�ର�Ʀr����k
//		}
//		str=Integer.toString(num);
//		num=0;
//	}
//	//Output
//	System.out.println(str);
//}