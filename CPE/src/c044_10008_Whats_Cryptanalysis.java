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
//int[] count = new int[256];//�snumber
//int len = 0;////�����X�{������
//
//while(scanner.hasNext()) {
//	String str = scanner.nextLine();
//	char[] ch  = str.toCharArray();//�Narray���Φ��r��
//	
//	for(char c:ch) {
//		count[Character.toUpperCase(c)]++;//�N���X���������array�åB++(ex.����djisd��d�ɡA�Nd�������array���۹������r����m)					
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