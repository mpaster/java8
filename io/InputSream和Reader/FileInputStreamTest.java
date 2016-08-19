import java.io.FileInputStream;
import java.io.IOException;

/* FileInputStream 和 FileReader 都是节点流（低级流） */
public class FileInputStreamTest{

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
		byte[] bbuf = new byte[1024];
		
		int hasRead = 0;
		
		// fis.read(bbuf) 返回 -1 时，表明输入流结束。
		while((hasRead = fis.read(bbuf)) > 0){
			System.out.println(new String(bbuf, 0, hasRead));
		}

		fis.close();// 关闭文件输入流，放在 finally 块里更安全。
	}
}