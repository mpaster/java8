import java.io.File;

/* 创建一个 hello.txt 文件 */
public class FileTest{
	
	public static void main(String[] args){
		String fileName = "G:" + File.separator + "javase" 
				+ File.separator + "io" + File.separator + "hello.txt";
		File f = new File(fileName);
		try{
			f.createNewFile();
			System.out.println("在G:\\javase\\io\\下创建了hello.txt");

		}catch(Exception e){
			e.printStackTrace();
		}

		// File 类中的两个常量：File.separator(\), File.pathSeparator(;)
		// linux下的分割就不是\了
		System.out.println(File.separator + "和" + File.pathSeparator);
	}
}