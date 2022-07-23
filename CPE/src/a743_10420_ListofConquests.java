import java.util.Map;//map �|�۰ʱN�r�����ǥ[�H�Ƨ�
import java.util.Scanner;
import java.util.TreeMap;

public class a743_10420_ListofConquests {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//Map �]�t TreeMap �ҥH�e���i�H�u��map
		Map<String,Integer> treemap = new TreeMap<String,Integer>();//<key,value><��a,�ƶq>
		
		for(int i=0;i<num;i++) {
			String country = scanner.next();//��a�u�n�@�ӬG�W�ߥX��
			String name = scanner.nextLine();//���M��scanner��W�r���o�ӳ����N�u�O���F����input���W�r�A��nextLine����]�O�]���i�H��J�ܦh�H�W
			
			if(treemap.containsKey(country)) //����a�o�ӭ�
				treemap.put(country, treemap.get(country)+1);//������ۦP��key�ñN�����쪺value+1
			else 
				treemap.put(country,1);//if treemap.containsKey(str) == false �ڭ̱N��a�W�٩�i�h�å[�@
		}
		
		for(Map.Entry<String,Integer> entry : treemap.entrySet() )//entrySet()�^�Ǧ��M�g���]�t���M�g���Y��set
			System.out.print(entry.getKey()+" "+entry.getValue());
	}
}

/*TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	String country[]=new String[n];//��n�Ӱ�a
	Set<String> set=new HashSet<String>();
	
	for(int i=0;i<n;i++) {
		country[i] = scanner.next();//�s��a���W��
		set.add(country[i]);//�ϥ�set�b�s��@����a�W�١C
		//Set�S�ʡG���|�s��ۦP��Object�A�o�˴N�i�H��X���ƪ���
		String No=scanner.nextLine(); //�]���m�W�S���Ψ�A�ҥH�����n�C
	}
	Arrays.sort(country);//�ѩ�p�G��a�ƥجۦP�|�ݭn�����a�W�١A�G�����a�W�ٶi��ƦC�C
	String[] st=set.toArray(new String[set.size()]);
	Arrays.sort(st);
	
	//�����set�s�񪺰�a�W�٥h����t�@��array����ư�����A�p�⦳�h�֭ӬۦP����a�W�١C
	for(int i=0;i<st.length;i++){
		int count=0;
		for(int j=0;j<n;j++){
			if(st[i].equals(country[j])) count++;
		}
	//Output
		System.out.println(st[i]+" "+count);
*/