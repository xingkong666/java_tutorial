/*
分支结构：
	单分支结构if(){}：
		只做单一条件的判断，如果符合条件做某些事
	双分支结构 if() {} else {}:
	多分支结构 if() {} else if {} ..else{}:
	switch分支结构，用于等值判断
	

*/

import java.util.Scanner;

public class IfDemo{
	public static void main(String[] args){
		//Math.random() 产生数据的范围是[0,1]浮点数
		//得到0-5之间的随机数
		int c = (int) (Math.random()*6);
		System.out.println(c);
		if (c>3){
			System.out.println("大于3");
		} else if (c == 2){
			System.out.println("等于2");
		}
		
		//Scanner
		//创建文件扫描器对象，System.in表示标准输入可以从控制台读取数据（装饰者模式）
		
		//Scanner  sc = new Scanner(System.in);
		//System.out.println("请输入数据");
		//String str = sc.nextLine();
		//System.out.println(str);
		
		
		//switch多分支结构
		/*
			注意：
				1、每个case模块中要添加break,防止多次匹配
				2、如果多个case中处理的逻辑代码块的功能一致，可以考虑只在最后添加一次处理
				3、default表示默认选项，当所有的case不匹配的时候，会执行此选项
				4、default可以有，也可以没有
				
		*/
		int random = (int)(Math.random()*26);
		char ch = (char)('a'+random);
		switch(ch){
			case 'a':
				System.out.println("元音：" + ch);
				break;
			case 'e':
				System.out.println("元音：" + ch);
				break;
			case 'i':
				System.out.println("元音：" + ch);
				break;
			case 'o':
				System.out.println("元音：" + ch);
				break;
			case 'u':
				System.out.println("元音：" + ch);
				break;
			case 'y':
				System.out.println("半元音：" + ch);
				break;
			case 'w':
				System.out.println("半元音：" + ch);
				break;
			default:
				System.out.println("辅音：" + ch);
				
		}
		
		
	}
}