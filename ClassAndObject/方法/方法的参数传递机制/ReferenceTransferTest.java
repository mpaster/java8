public class ReferenceTransferTest{
	
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap 方法里，a 的值为："+dw.a+", b 的值为："+dw.b);
		// 直空，会被回收。但 main 方法中的 dw 照常输出了，说明不是同一个引用
		dw = null;
		System.out.println(dw);
	}

	public static void main(String[] args){
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		// dw 引用的复制品被传入，但会指向同一个 DataWrap 对象
		ReferenceTransferTest.swap(dw);
		System.out.println("main 方法中，交换后的结果：a："+dw.a+",b："+dw.b);
	}

}

class DataWrap{
	int a;
	int b;
}