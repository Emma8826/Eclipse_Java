import java.util.Scanner;
import java.util.*;
import java.io.*;
/* ���A��Ӿ�� N (0<N<=10000), M (0<M<=10000)�A�A�n�̷ӬY�ǳW�h�Ƨ�N�Ӿ�ơC
 * ���Q�ΨC�ӼƦr���HM���l�ƥѤp��j�ơA�Y�ƧǤ��������Ƭ��@�_�@���B��ư��HM ���l�Ƭ۵��A�h�_�ƭn�Ʀb���ƫe���C
 * �Y��_�ư��HM�l�Ƥj�p�۵��A�h�쥻�ƭȸ��j���_�ƱƦb�e���C
 * �P�˪��A�Y�ⰸ�ư��HM�l�Ƥj�p�۵��A�h���p�����ƱƦb�e���C
 * �ܩ�t�ƪ��l�ƭp��M C �y���̪��w�q�ۦP�A�Y�t�ƪ��l�Ƶ��藍�|�j��s�C
 * �Ҧp -100 MOD 3 = -1, -100 MOD 4 = 0 �̦������C
 * */
/*
 N%M �p�̫e �j�̫�
 �l�ƦP �_�ƫe ���ƫ�
 �Ҭ��_ �j�_�e �p�_��
 �Ҭ��� �p���e �j����
*/
public class d750_11321_Sort_Sort_and_Sort {
	public static void main(String[] args) throws Exception {
	
	  Scanner sc = new Scanner(System.in);
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	  String s;
	 
	  while ((s = br.readLine()) != null) {
	      String[] temp = s.split("[ ]");
	      int n = Integer.parseInt(temp[0]);
	      int m = Integer.parseInt(temp[1]);
	      System.out.println(n + " " + m);
	      if (n == 0 && m == 0) {
	          break;
	      }
	      PriorityQueue<Number> arr = new PriorityQueue<Number>();
	      for (int i = 0; i < n; i++) {
	          int res = Integer.parseInt(br.readLine());
	          Number x = new Number(res, res % m);
	          arr.add(x);
	      }
	      while (!arr.isEmpty()) {
	          pw.println(arr.poll().n);
	      }
	      pw.flush();
	  }
	  pw.close();
	}
	}
	
	/**
	* Number class that implements <code>Comparable</code> for sorting purpose.
	*/
	class Number implements Comparable<Number> {
	
	public int n;
	private boolean even;
	private int val;
	
	public Number(int n, int val) {
	  this.n = n;
	  this.even = false;
	  if (n % 2 == 0) {
	      even = true;
	  }
	  this.val = val;
	}
	
	public int compareTo(Number o) {
	  if (this.val < o.val) {
	      return -1;
	  } else if (this.val == o.val) {
	      if (!this.even && o.even) {
	          return -1;
	      } else if (!this.even && !o.even) {
	          if (this.n > o.n) {
	              return -1;
	          }
	      } else if (this.even && o.even) {
	          if (this.n < o.n) {
	              return -1;
	          }
	      }
	  }
	  return 1;
    }
}