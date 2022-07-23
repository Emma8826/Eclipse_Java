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
				//搜尋哪個字串的位置??-->抓取使用者所輸入的字串的字元(.charAt()語法)
				//用if判斷式，判斷ans的字元位置是否有在鍵盤對照表裡，
				//如果有就將位置減2(向左一兩格)之後印出，如果沒有則保持原樣印出
				/*	Eg: String myStr = "Hello World!";
					System.out.println(myStr.indexOf("o"));
					Output: 4
				*/
				//chartAt回傳英文字母
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