import java.io.FileInputStream;
import java.io.IOException;

/* FileInputStream �� FileReader ���ǽڵ������ͼ����� */
public class FileInputStreamTest{

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
		byte[] bbuf = new byte[1024];
		
		int hasRead = 0;
		
		// fis.read(bbuf) ���� -1 ʱ������������������
		while((hasRead = fis.read(bbuf)) > 0){
			System.out.println(new String(bbuf, 0, hasRead));
		}

		fis.close();// �ر��ļ������������� finally �������ȫ��
	}
}