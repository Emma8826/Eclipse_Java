import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sort_Sort_and_Sort_version3 {
	
	public static class input implements Comparable<input> {

		public int num = 0;
		public int mod = 0;
		public boolean odd = false;

		@Override
		public int compareTo(input arg0) {

			if (mod < arg0.mod)
				return -1;

			if (mod == arg0.mod) {
				if (num == arg0.num)
					return 0;
				if (odd && !arg0.odd)
					return -1;
				if (odd && arg0.odd && num > arg0.num)
					return -1;
				if (!odd && !arg0.odd && num < arg0.num)
					return -1;
			}

			return 1;
		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//array 變數
			input[] a;

			int n;
			int m;

			while (true) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				n = Integer.parseInt(st.nextToken());
				m = Integer.parseInt(st.nextToken());
				a = new Sort_Sort_and_Sort_version3.input[n];
				if (n == 0 && m == 0) {
					System.out.println("0 0");
					break;
				}

				System.out.printf("%d %d\n", n, m);

				//讀進數字
				for (int i = 0; i < n; i++) {
					a[i] = new input();
					a[i].num = Integer.parseInt(reader.readLine());
					a[i].mod = a[i].num % m;
					a[i].odd = Math.abs(a[i].num) % 2 != 0;
				}
				//使用 Comparator 對數組進行排序
				Arrays.sort(a);
				
				//輸出
				for (int i = 0; i < n; i++) {
					System.out.println(a[i].num);
				}
				
			}
	}
}
