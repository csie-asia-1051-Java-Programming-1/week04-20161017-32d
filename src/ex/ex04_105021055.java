package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021055 王浚維
 */
import java.util.Scanner;
public class ex04_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正數字及一個字元符號");
		int n = scn.nextInt();
		char y=scn.next().charAt(0);
		for(int x=1;x<=n;x++){
		for(int z=n;z>=x;z--){
		System.out.print(y);
		}
		System.out.println();
		}
	}

}
