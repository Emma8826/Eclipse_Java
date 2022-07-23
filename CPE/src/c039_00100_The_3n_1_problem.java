import java.util.Scanner;

public class c039_00100_The_3n_1_problem{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int min = Math.min(n1, n2);
			int max = Math.max(n1, n2);
			int cycle_length = 1;
			
			for(int i=min;i<=max;i++) {
				int temp=1;
				for(int j=i;j!=1;) {//infinite loop
					if((j%2)==1)//狦琌计
						j = (j*3)+1;
					else
						j/=2;
					temp++;
				}
				if(temp>cycle_length) 
					cycle_length = temp;	
			}
			System.out.printf("%d %d %d\n",n1,n2,cycle_length);
		}
	scanner.close();
	}
}
/*
Scanner scanner = new Scanner(System.in);
while(scanner.hasNext()) {
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int max = Math.max(a, b);
	int min = Math.min(a, b);
	int cycle_length = 0;//程
	int largestnum = 0;//程计
	for(int i=min;i<=max;i++) {
		int temp = 1;//1衡cycle_length┮礚阶常璶Τ
		for(int j=i;j!=1;) {//礚癹伴
			if((j%2)!=0) 
				j = (j*3)+1;
			else 
				j /= 2;
			temp++;
		}
		if(temp>cycle_length) {
			cycle_length = temp;
			largestnum = i;
		}
			
	}
	System.out.printf("%d %d %d\n",a,b,cycle_length);
	System.out.println("Largest number is "+largestnum);
}
scanner.close();*/	