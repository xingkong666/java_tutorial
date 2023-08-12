/*
数据类型 
	Java是一种强类型的语言
		强类型表示，变量在定义的时候必须显式的声明类型是什么        java
		弱类型表示，变量会根据值自己去推断，不需要指定类型是什么    python,js,scala
	Java数据类型
		基本数据类型（4类8种）
			整数类型：byte short int long (不同类型表示不同的长度)
				byte: 使用一个字节储存，因此范围是 -128到127  
				short: 使用两个字节储存，因此范围是 -32768 到 32767
				int: 使用四个字节储存，因此范围是正负21亿  -2^31 ~ 2^31-1，即 -2147483648 到 2147483647
				long: 使用八个字节储存，因此范围是 -2^63 ~ (2^63 - 1)
				注意：
					1、在使用整型类型的时候，默认都是int类型
					2、如果使long类型必须要在数字后添加L,建议使用大写小写容易和1混淆
				
			浮点类型: float double
				float: 单精度，精度可以精确到小数点后7位
				double: 双精度，精度是float的双倍
				注意：
					1、默认浮点类型是double类型
					2、使用float的时候，数字后要加f
					3、浮点类型并不能表示一个精度的值，会损失一定的精度
			字符类型: char
				占用2个字节，使用的时候使用''标识
			布尔类型: boolen
				只有true 和 false,在储存时占1位
		引用数据类型:
			类
			接口
			数组
*/

public class DataTypeDemo{
	public static void main(String [] args){
		byte b=127;
		short s = 32767;
		int i =111111;
		long l = 11111111111L;
		
		float f = 2.1223123F;
		double d = 1112.3343;
		float f2 = 2.12231239999F;
		System.out.println(f==f2);
		
		//表示一个字符
		char a = 'A';
		//表示字符序列
		String s1="A";
		System.out.println(a==65);
		
	}
	
}