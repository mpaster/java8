import java.io.File;

/* �г�ָ��Ŀ¼��ȫ���ļ�(���������ļ�) */
public class FileTest4{
	
	public static void main(String[] args){
		String fileName = "D:" + File.separator;
		File f = new File(fileName);
		File[] fs = f.listFiles();
		for(int i = 0; i < fs.length; i++){
			System.out.println(fs[i]); // listFiels ���������ȫ·��
		}

		// ʹ��isDirectory�ж�һ��ָ����·���Ƿ�ΪĿ¼
		// boolean isDirectory(); �磬f.isDirectory();
	}
}