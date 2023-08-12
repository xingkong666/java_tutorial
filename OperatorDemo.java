/*
运算符：
	算数运算符:+ - * / %  ++ --
	
	赋值运算符：=
	扩展赋值运算符：+= -= *= /=
	关系运算符： > < >= <=  == !=
	逻辑运算符； && || 
	位运算符： & | ^ ~  >>   <<   >>>
	条件运算符：?

*/



public class OperatorDemo{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		// 取整除，或者取商 
		System.out.println(a / b);
		// 取余数，（取模）
		System.out.println(a % b);
		
		//单目运算符
		//++，表示在变量原有的基础上+1,谁在前，先运算谁
		System.out.println(a++);
		System.out.println(++a);
		
		//--，表示在变量原有的基础上+1,谁在前，先运算谁
		System.out.println(a--);
		System.out.println(--a);
		
		//6?? ++b是先自加  b++是先运算
		System.out.println(++b+b++);
		//扩展运算符
		int c = 1;
		c  = c + 2;
		c += 2;
		
		// 类型转换问题，d 是byte,d +1 整体变成int类型，需要将int类型的值转换为byte,会有精度损失
		//建议在进行操作的时候使用扩展运算符
		byte d = 10;
		//d = d + 1;
		d+=1;
		System.out.println(d);
		
		//关系运算符
		System.out.println("------关系运算符------");
		System.out.println(1>2);
		System.out.println(1<2);
		System.out.println(1>=2);
		System.out.println(1<=2);
		System.out.println(1==2);
		System.out.println(1!=2);
		
		
		//逻辑运算符；
		/*
			&& 表示短路与，两边表达式只要有一个是false，整体结果就是false
				两边表达式从左到右开始对比，如果左边的表达式是false，右边需要进行判断
			|| 表示短路或，两个表达式中只要有一个是true,整体结果就是ture
				两边表达式从左向右开始对比，如果左边的表达式是true，右边不需要再进行判断
		*/
		System.out.println("------逻辑运算符------");
		System.out.println(3>5 && 3<4);
		System.out.println(3>5 || 3<4);
		System.out.println(!(3>5 && 3<4));//取反
		
		//位运算符：只能操作数值，操作的时候会转成二进制进行运算
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		//移码，补码，原码，反码 ？？？
		System.out.println(~4); // -5
		
		//左移表示乘以2，右移表示除以2  
		System.out.println(2<<3); //16 00000010 — 00010000
		System.out.println(16>>2); //4 00010000 - 00000100
		
		//条件运算符或者叫三目运算符
		//使用的时候需要跟一个表达式，表达式如果是true 则返回？号的结果，如果是false则返回：后的结果
		
		System.out.println("---条件运算符  三目运算符-----");
		System.out.println(3>2?3:2);
		
		
		
		
		
		
		
		
	}
	
}