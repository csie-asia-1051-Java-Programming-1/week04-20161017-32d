package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021055 王浚維
 */
import java.util.Scanner;
public class ex02_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true){
		System.out.print("請輸入n , m");
		int n,m;
		n = scn.nextInt();
		m = scn.nextInt();
		System.out.print(  n +"*" + m );
		System.out.print("是否繼續(Y/N)");
		char a = scn.next().charAt(0);
		if (a=='Y'){System.out.println(n*m);}
		else if (a=='N'){System.out.println();
		break;
		}
	}
	}
}

		
	


