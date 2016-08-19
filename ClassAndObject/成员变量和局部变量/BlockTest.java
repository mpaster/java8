public class BlockTest{
	public static void main(String[] args){
		{ // 定义一个代码块
			int a;
			//System.out.println("未初始化 a 的值为："+a); // 报错
			a = 5;
			System.out.println("初始化后 a 的值为："+a);
		}
		//System.out.println("代码块外 a 的值为："+a); // 报错
	}
}