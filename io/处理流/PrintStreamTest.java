import java.io.*;

public class PrintStreamTest{

	public static void main(String[] args){
		
		/* ����������ʱֻ�贫��һ���ڵ�����Ϊ�������������� */
		try(
			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream ps = new PrintStream(fos)
		){
			ps.println("��ͨ�ַ���");
			ps.println(new PrintStreamTest());
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		// ��������װ�˵ײ�ڵ������ر�����/�������Դʱ��ֻ��Ҫ�ر��ϲ�Ĵ��������ɣ�ϵͳ���Զ��رսڵ�������
	}
}