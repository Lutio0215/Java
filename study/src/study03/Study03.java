package study03;

import java.util.Scanner;

/**
 *
 * @author 狗叁
 *
 */
public class Study03 {
	//主方法
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个需要判断的数：");
		x = sc.nextInt();
		Study03 study = new Study03();
		boolean bl;
		bl = study.pd(x);
		System.out.print("判断的结果为：");
		System.out.println(bl);
	}
	//判断是否是素数的方法
	public boolean pd(int x) {
		int i;
		for (i = 2; i < x;i++) {
			if (x%i==0) {
				break;
			}
			else
				continue;
		}
		if (i == x) {
			return true;
		}
		else
			return false;
		
	}
	
}
