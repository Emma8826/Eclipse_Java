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
				
				//找出某數的因數。
				int j=1;
				while(j<=temp){
					if(temp%j==0)vector.add(j);
					j++;
				}
				
				//因數加總。
				Iterator<Integer> iterator=vector.iterator();
				int sum=0;
				while(iterator.hasNext()){
					sum=sum+iterator.next();
				}
				
				//進行判斷。
				if(n==sum){
					System.out.println("Case "+cases+": "+temp);
					break;
				}
				//當i已經等於1時代表已經沒有答案了，所以輸出-1。
				if(i==1)System.out.println("Case "+cases+": -1");
				
			}
			cases++;
		}
		scanner.close();
	}

}
