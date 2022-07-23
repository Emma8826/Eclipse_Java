import java.util.Scanner;
public class e516_10409_Die_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int cases;
		while(scanner.hasNext() && (cases = scanner.nextInt()) != 0) {//這裡的cases就有讀到了
			int top = 1,n =2,e=3,w=4,s=5;//initial condition
			for(int i=1;i<=cases;i++) {
				String direction = scanner.next();
				
				switch(direction) {
					case "north":
						n = top;
						top = s;
						break;
					case "south":
						s = top;
						top = n;
						break;
					case "east":
						e = top;
						top = w;
						break;
					case "west":
						w = top;
						top = e;	
						break;
				}
			}
			System.out.println(top);
		}
	scanner.close();
	}
}
