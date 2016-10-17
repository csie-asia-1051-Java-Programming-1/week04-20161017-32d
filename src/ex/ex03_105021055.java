package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021055 王浚維
 */
import java.util.Scanner;
public class ex03_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int x=1;x<=n;x++){
		for(int z=1;z<=x;z++){
			System.out.print("*");
		
		}
		System.out.println();
	}
}
}
