import java.util.Scanner;
public class uva1260_sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
		   int T = input.nextInt();
		   
		   while(T > 0){
		    int n = input.nextInt();
		    int[] A = new int[n];//A
		    int[] B = new int[n - 1];//B
		     
		    A[0] = input.nextInt();
		    for(int i = 1; i < A.length; ++i){
		     A[i] = input.nextInt();
		     int countNongreater = 0;
		     for(int j = 0; j < i; ++j){
		      if(A[j] <= A[i]){
		       ++countNongreater;
		      }
		     } 
		     B[i - 1] = countNongreater;
		    }
		     
		    int sumB = 0;
		    for(int i = 0; i < B.length; ++i){
		     sumB += B[i];
		    }
		     
		    System.out.println(sumB);
		     
		    --T;
		   }
		}
	}
}
