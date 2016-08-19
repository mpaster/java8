import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOutputStreamTest{

	public static void main(String[] args){

		System.out.println("读取 FileInputStreamTest.java ，再写入到 newFile.txt 中");
		
		try(
			FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
			FileOutputStream fos = new FileOutputStream("newFile.txt");
		){
			byte[] bbuf = new byte[32];
			int hasRead = 0;

			while((hasRead = fis.read(bbuf)) > 0){
				fos.write(bbuf, 0, hasRead);// 每读一次写一次，读了多少，写多少
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
}