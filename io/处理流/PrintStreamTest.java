import java.io.*;

public class PrintStreamTest{

	public static void main(String[] args){
		
		/* 创建处理流时只需传入一个节点流作为构造器参数即可 */
		try(
			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream ps = new PrintStream(fos)
		){
			ps.println("普通字符串");
			ps.println(new PrintStreamTest());
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		// 处理流包装了底层节点流，关闭输入/输出流资源时，只需要关闭上层的处理流即可（系统会自动关闭节点流）。
	}
}