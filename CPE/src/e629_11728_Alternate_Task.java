import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;
public class e629_11728_Alternate_Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cases=1;
		
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			for(int i=n;i>0;i--){
				Vector<Integer> vector=new Vector<Integer>();
				int temp=i;
				
				//��X�Y�ƪ��]�ơC
				int j=1;
				while(j<=temp){
					if(temp%j==0)vector.add(j);
					j++;
				}
				
				//�]�ƥ[�`�C
				Iterator<Integer> iterator=vector.iterator();
				int sum=0;
				while(iterator.hasNext()){
					sum=sum+iterator.next();
				}
				
				//�i��P�_�C
				if(n==sum){
					System.out.println("Case "+cases+": "+temp);
					break;
				}
				//��i�w�g����1�ɥN��w�g�S�����פF�A�ҥH��X-1�C
				if(i==1)System.out.println("Case "+cases+": -1");
				
			}
			cases++;
		}
		scanner.close();
	}

}
