/*
常量和变量
	常量：在程序运行过程中，值不会发生变化的量叫做常量
	变量：在程序运行过程中，值会发生变化的量叫做变量
	
	变量：
		1、先声明，后赋值
			int a;声明
			a=10;赋值
		2、声明+赋值
			int b=20;
	常量：
		使用final关键字修饰的变量称之为常量或者叫做最终常量，表示不可修改
		
	注意：
		在类内，方法外定义的变量叫成员变量，会存在默认值
		在方法内，定义的变量必须要进行初始化操作，不会存在默认值
		在一行中可以定义多个变量，但是不推荐，每个变量最好单独一行

*/

public class ConstantAndVar{
	
	static int d; //成员变量，默认值 0
	
	public static void main(String [] args){
		//声明
		int a;
		//赋值
		a = 10;
		
		//声明加赋值
		int b = 20;
		int c; 
		System.out.println(d);
		//System.out.println(c); c不存在默认值
		
		//int x, y = 10,20; 错误
		int x = 10,y = 20;
		final int z =30; //常量
		
		
	}
	
}