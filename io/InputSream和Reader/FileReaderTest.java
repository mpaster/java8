import java.io.FileReader;
import java.io.IOException;

/* FileInputStream �� FileReader ���ǽڵ������ͼ����� */
public class FileReaderTest{

	public static void main(String[] args){
		
		// ����ʹ�����Զ��ر���Դ�� try ������ر��ļ�������
		try(FileReader fr = new FileReader("FileReaderTest.java")){
			char[] cbuf = new char[32]; // �ַ�����
			int hasRead = 0;

			while((hasRead = fr.read(cbuf)) > 0){
				System.out.println(new String(cbuf, 0, hasRead));
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}