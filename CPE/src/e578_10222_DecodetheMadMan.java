import java.util.Scanner;
public class e578_10222_DecodetheMadMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		int ans;
		while(scanner.hasNext()) {
			String input = scanner.nextLine().toLowerCase();
			for(int i=0;i<input.length();i++) {
				//�j�M���Ӧr�ꪺ��m??-->����ϥΪ̩ҿ�J���r�ꪺ�r��(.charAt()�y�k)
				//��if�P�_���A�P�_ans���r����m�O�_���b��L��Ӫ�̡A
				//�p�G���N�N��m��2(�V���@���)����L�X�A�p�G�S���h�O����˦L�X
				/*	Eg: String myStr = "Hello World!";
					System.out.println(myStr.indexOf("o"));
					Output: 4
				*/
				//chartAt�^�ǭ^��r��
				ans = str.indexOf(input.charAt(i));//"hello".charAt(0); // "h"
				
				if(ans != -1)
					System.out.print(str.charAt(ans-2));
				else
					System.out.print(input.charAt(i));
			}
			System.out.println("");
		}
		scanner.close();
	}
}