import java.util.Scanner;
import java.util.Arrays;

public class a737_10041_Vitos_family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		
		while(cases != 0){
			int sum = 0;
			int num = scanner.nextInt();
			int[] arr = new int[num];
			
			for(int i=0;i<arr.length;i++)
				arr[i] = scanner.nextInt();
			
			Arrays.sort(arr);
			int middle = arr[num/2];
			
			for(int i=0;i<arr.length;i++)
				sum += Math.abs(middle - arr[i]);
			
			System.out.println(sum);
			cases--;
		}
		scanner.close();
	}
}