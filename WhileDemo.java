/*
循环结构：
	1、while
		需要四部分组成
			初始化：变量的初始化
			条件判断：必须要求返回true或者false的值
			循环体：具体的执行的逻辑代码
			迭代变量：促使此循环结束
	2、 do  while 循环结构

*/


public class WhileDemo{
	
	public static void main(String[] args ){
	/*
		int i = 1;
		while (i<=100){
			System.out.println(i);
			i++;
	}
	*/
	//100以内偶数和
	int sum = 0;
	int i = 1;
	while (i<=100){
		sum+= i%2==0?i:0;
		i++;
	}
	System.out.println("一百以内偶数和是："+sum);

	int i2= 1;
	do {
		System.out.println("第"+i2+"次循环");
		i2++;
	}while(i2 <= 100);

}
}
