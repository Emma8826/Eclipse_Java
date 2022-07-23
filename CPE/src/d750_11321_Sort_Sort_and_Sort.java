import java.util.Scanner;
import java.util.*;
import java.io.*;
/* 倒ㄢ俱计 N (0<N<=10000), M (0<M<=10000)璶ㄌ酚琘ㄇ砏玥逼N俱计
 * ノ–计埃M緇计パ逼璝逼いゑ耕ㄢ计案ㄢ计埃M 緇计单玥计璶逼案计玡
 * 璝ㄢ计埃M緇计单玥セ计耕计逼玡
 * 妓璝ㄢ案计埃M緇计单玥耕案计逼玡
 * 璽计緇计璸衡㎝ C 粂ē柑﹚竡璽计緇计荡癸ぃ穦箂
 * ㄒ -100 MOD 3 = -1, -100 MOD 4 = 0 ㄌ摸崩
 * */
/*
 N%M 玡 
 緇计 计玡 案计
  玡 
 案 案玡 案
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