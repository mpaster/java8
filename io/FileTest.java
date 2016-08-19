import java.io.File;

/* ����һ�� hello.txt �ļ� */
public class FileTest{
	
	public static void main(String[] args){
		String fileName = "G:" + File.separator + "javase" 
				+ File.separator + "io" + File.separator + "hello.txt";
		File f = new File(fileName);
		try{
			f.createNewFile();
			System.out.println("��G:\\javase\\io\\�´�����hello.txt");

		}catch(Exception e){
			e.printStackTrace();
		}

		// File ���е�����������File.separator(\), File.pathSeparator(;)
		// linux�µķָ�Ͳ���\��
		System.out.println(File.separator + "��" + File.pathSeparator);
	}
}