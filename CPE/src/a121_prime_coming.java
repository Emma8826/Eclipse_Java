import java.util.Scanner;
import java.math.BigInteger;
public class a121_prime_coming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		while(scanner.hasNext()){
		   BigInteger n = new BigInteger(scanner.next());
		   BigInteger m = new BigInteger(scanner.next());
		   
		   //condition ? exprIfTrue : exprIfFalse
		   int sum = n.isProbablePrime(1000) ? 0 : -1;
		 
		   while(n.compareTo(m) != 1){
		    n = n.nextProbablePrime();
		    sum++;
		   }
		 
		   System.out.println(sum == -1? 0 : sum);
		  }
		
	}
}
