package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021055 王浚維
 */
import java.util.Scanner;
public class ex01_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = 0;
		int sum = 0;
		int y = 0;
		while(x!=-1){
		y++;
		sum+=x;
		System.out.print("請輸入正整數");
		x=scn.nextInt();}
	 y--;
	 System.out.print(sum);
	 System.out.print((float)sum/y);
	  
	  
  }
}
  
