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
				
				//т琘计计
				int j=1;
				while(j<=temp){
					if(temp%j==0)vector.add(j);
					j++;
				}
				
				//计羆
				Iterator<Integer> iterator=vector.iterator();
				int sum=0;
				while(iterator.hasNext()){
					sum=sum+iterator.next();
				}
				
				//秈︽耞
				if(n==sum){
					System.out.println("Case "+cases+": "+temp);
					break;
				}
				//讽i竒单1竒⊿Τ氮┮块-1
				if(i==1)System.out.println("Case "+cases+": -1");
				
			}
			cases++;
		}
		scanner.close();
	}

}
