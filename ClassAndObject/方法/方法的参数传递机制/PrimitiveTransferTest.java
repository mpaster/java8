public class PrimitiveTransferTest{
	
	public static void swap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap 方法里，a 的值为："+a+", b 的值为："+b);
	}

	public static void main(String[] args){
		int a = 6;
		int b = 9;
		// a, b 的复制品被传入，实际值不受影响
		PrimitiveTransferTest.swap(a, b);
		System.out.println("main 方法中，交换后的结果：a："+a+",b："+b);
	}

}