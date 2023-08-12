/*
标识命名规范 
	硬性规定：
	1、标识符必须以字母、下划线或者美元符号开头
	2、其他部分必须是字母、数字、下划线或者美元符号，但是不能出现特殊符号
	3、标识符大小写敏感
	4、不能是java的关键字或者保留字（留给系统使用的表示特殊含义的字符）
	
*/ 
public class IdentifiedDemo{
	public static void  main(String [] args){
		int _a=10;
		int $b=20;
		//int a+b=30 错误
		int a = 10;
		//int public=20;
	}
	
}