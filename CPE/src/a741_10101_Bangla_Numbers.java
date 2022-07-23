import java.util.Scanner;
public class a741_10101_Bangla_Numbers {
	public static void loop(long num){
		if(num==0)
			return;
	
		if(num>=10000000) {
			loop(num/10000000);//先取前段的部分分解，因為kuti是最大的，所以以它為基準切割
			System.out.print(" kuti");
			loop(num%10000000);
		}
		else if(num >= 100000) {
			System.out.print(" "+num/100000+" lakh");
			loop(num%100000);	
		}
		else if(num >= 1000) {
			System.out.print(" "+num/1000+" hajar");
			loop(num%1000);
		}	
		else if(num >= 100) {
			System.out.print(" "+num/100+" shata");
			loop(num%100);
		}else 
			System.out.print(" "+num);//輸出剩餘的餘數
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count= 0;
		while(scanner.hasNext()) {
			long num = scanner.nextLong();
			++count;
			System.out.printf("%4d.",count);
			
			if(num!=0)
				loop(num);
            else 
                System.out.print(" 0");    
		
			System.out.println("");
		}
		scanner.close();
	}
}