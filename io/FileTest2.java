import java.io.File;

/* ɾ��һ�� hello.txt �ļ� */
public class FileTest2{
	
	public static void main(String[] args){
		String fileName = "G:" + File.separator + "javase" 
				+ File.separator + "io" + File.separator + "hello.txt";
		File f = new File(fileName);
		if(f.exists()){
			f.delete();
			System.out.println("�ɹ���ɾ����G:\\javase\\io\\�µ� hello.txt");
		}else{
			System.out.println("�ļ�������");
		}
	}
}