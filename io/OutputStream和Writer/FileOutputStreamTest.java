import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOutputStreamTest{

	public static void main(String[] args){

		System.out.println("��ȡ FileInputStreamTest.java ����д�뵽 newFile.txt ��");
		
		try(
			FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
			FileOutputStream fos = new FileOutputStream("newFile.txt");
		){
			byte[] bbuf = new byte[32];
			int hasRead = 0;

			while((hasRead = fis.read(bbuf)) > 0){
				fos.write(bbuf, 0, hasRead);// ÿ��һ��дһ�Σ����˶��٣�д����
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
}