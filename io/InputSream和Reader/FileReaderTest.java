import java.io.FileReader;
import java.io.IOException;

/* FileInputStream 和 FileReader 都是节点流（低级流） */
public class FileReaderTest{

	public static void main(String[] args){
		
		// 这里使用了自动关闭资源的 try 语句来关闭文件输入流
		try(FileReader fr = new FileReader("FileReaderTest.java")){
			char[] cbuf = new char[32]; // 字符数组
			int hasRead = 0;

			while((hasRead = fr.read(cbuf)) > 0){
				System.out.println(new String(cbuf, 0, hasRead));
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}