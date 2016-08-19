import java.io.File;

/* 创建一个 hello 的目录 */
public class FileTest3{
	
	public static void main(String[] args){
		String fileName = "G:" + File.separator + "javase" 
				+ File.separator + "io" + File.separator + "hello";
		File f = new File(fileName);
		f.mkdir();
	}
}