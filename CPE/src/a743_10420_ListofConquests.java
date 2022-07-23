import java.util.Map;//map 會自動將字母順序加以排序
import java.util.Scanner;
import java.util.TreeMap;

public class a743_10420_ListofConquests {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//Map 包含 TreeMap 所以前面可以只有map
		Map<String,Integer> treemap = new TreeMap<String,Integer>();//<key,value><國家,數量>
		
		for(int i=0;i<num;i++) {
			String country = scanner.next();//國家只要一個故獨立出來
			String name = scanner.nextLine();//雖然有scanner到名字但這個部分就只是為了接受input的名字，用nextLine的原因是因為可以輸入很多人名
			
			if(treemap.containsKey(country)) //有國家這個值
				treemap.put(country, treemap.get(country)+1);//對應到相同的key並將對應到的value+1
			else 
				treemap.put(country,1);//if treemap.containsKey(str) == false 我們將國家名稱放進去並加一
		}
		
		for(Map.Entry<String,Integer> entry : treemap.entrySet() )//entrySet()回傳此映射中包含的映射關係的set
			System.out.print(entry.getKey()+" "+entry.getValue());
	}
}

/*TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	String country[]=new String[n];//有n個國家
	Set<String> set=new HashSet<String>();
	
	for(int i=0;i<n;i++) {
		country[i] = scanner.next();//存國家的名稱
		set.add(country[i]);//使用set在存放一份國家名稱。
		//Set特性：不會存放相同的Object，這樣就可以找出重複的值
		String No=scanner.nextLine(); //因為姓名沒有用到，所以不重要。
	}
	Arrays.sort(country);//由於如果國家數目相同會需要比較國家名稱，故先把國家名稱進行排列。
	String[] st=set.toArray(new String[set.size()]);
	Arrays.sort(st);
	
	//拿剛剛set存放的國家名稱去跟剛剛另一份array的資料做比較，計算有多少個相同的國家名稱。
	for(int i=0;i<st.length;i++){
		int count=0;
		for(int j=0;j<n;j++){
			if(st[i].equals(country[j])) count++;
		}
	//Output
		System.out.println(st[i]+" "+count);
*/