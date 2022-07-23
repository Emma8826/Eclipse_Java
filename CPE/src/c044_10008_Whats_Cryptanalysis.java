import java.util.*;

public class c044_10008_Whats_Cryptanalysis{
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
		int c[] = new int[300];
		int len = 0;
		int n = Integer.valueOf(sc.nextLine());
		
		while (n-- > 0) {
			String s = sc.nextLine();
			len += s.length();
			s = s.toUpperCase();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					c[(int)s.charAt(i)]++;
			}
		}
		
		while (len-- > 1) {
			for (int i = 'A'; i <= 'Z'; i++)
				if (c[i] == len)
					System.out.println((char)i + " " + len);
		}
	}
}

//c044_10008_Whats_Cryptanalysis

//Scanner scanner = new Scanner(System.in);
//
//int[] count = new int[256];//存number
//int len = 0;////紀錄出現的次數
//
//while(scanner.hasNext()) {
//	String str = scanner.nextLine();
//	char[] ch  = str.toCharArray();//將array分割成字串
//	
//	for(char c:ch) {
//		count[Character.toUpperCase(c)]++;//將走訪的元素放到array並且++(ex.當走到djisd的d時，將d元素放到array中相對應的字母位置)					
//		len++;
//	}
//}
////System.out.println(len);
//for(int i=len;i>=1;i--) {
//	for(char j='A';j<='Z';j++) {
//		if(count[j]==i)
//			System.out.println(j+" "+i);
//	}
//}