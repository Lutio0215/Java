package main;

import java.util.Scanner;

/**
 * @date 2019.11.05
 * @author 狗叁
 * @name 计算器带有密码功能的
 */

public class Sz  {
	//主方法
	public static void main(String[] args) {
		//实例化类
		Sz sz = new Sz();
		//进入判断方法
		sz.startPd();
		
	}
	//起始程序判断方法
	public void startPd() {
		//实例化类
		Sz sz = new Sz();
		Scanner sc = new Scanner(System.in);
		//提示
		System.out.print("Please input 'Y' enter your application:");
		//输入转化字符
		char str = sc.next().charAt(0);
		if(str == 'y' || str == 'Y') {
			//调用密码登陆方法
			sz.passwdLogin();
		}else {
			//退出程序
			System.exit(-1);
		}
		
		 
	}
	//密码登陆方法
	public void passwdLogin() {
		Sz sz = new Sz();
		Scanner sc = new Scanner(System.in);
		//定义密码变量
		int passwd;
		for(int l=1;l<4;l++) {
			//打印提示语
			System.out.print("Please input your password:");
			passwd = sc.nextInt();
			//如果密码正确 
			if(passwd == 20010125) {
				//提示成功
				System.out.println("Lodaing.....");
				//调用主计算器主面板
				sz.mainTeb();
				//跳出循环
				break;
				
			}else {
				//如果密码失败 提示
				System.out.println("Error!");
				//如果拥有三次机会
				if(l<3) {
					System.out.println("You still have "+(3-l)+" chances");
				}
				//机会第四次退出
				if(l == 3)
					System.exit(-1);
				
			}
			
		}
	}
	//主面板方法
	public void mainTeb() {
		//实例化类
		Sz sz = new Sz();
		Scanner sc = new Scanner(System.in);
		//起始界面
		System.out.println("Welcome!");
		System.out.println("*********");
		System.out.println("* 1.加法   *");
		System.out.println("* 2.减法   *");
		System.out.println("* 3.乘法   *");
		System.out.println("* 4.除法   *");
		System.out.println("*********");
		System.out.println("请输入相应数字：");
		//定义输入变量
		int g;
		g = sc.nextInt();
		sz.gnpd(g);
		
	}
	//功能判断方法
	public void gnpd(int a) {
		double res = 0;
		Scanner sc = new Scanner(System.in);
		int x,y;
		Sz sz = new Sz();
		System.out.print("请输入需要计算的第一个数：");
		x = sc.nextInt();
		System.out.print("请输入需要计算的第二个数：");
		y = sc.nextInt();
		if(a == 1)
			res = sz.add(x, y);
		else if(a == 2)
			res = sz.jf(x, y);
		else if(a == 3)
			res = sz.cf(x, y);
		else if(a == 4)
			res = sz.chuf(x, y);
		else {
			System.out.println("Error!");
			System.exit(-1);
		}
		System.out.println("结果为："+res);
		
	}
	//加法
	public double add(double x,double y) {
		return x+y;
	}
	//减法
	public double jf(double x,double y) {
		return x-y;
	}
	//乘法
	public double cf(double x,double y) {
		return x*y;
	}
	//除法
	public double chuf(double x,double y) {
		return x/y;
	}
	
}