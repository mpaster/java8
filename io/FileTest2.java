import java.io.File;

/* 删除一个 hello.txt 文件 */
public class FileTest2{
	
	public static void main(String[] args){
		String fileName = "G:" + File.separator + "javase" 
				+ File.separator + "io" + File.separator + "hello.txt";
		File f = new File(fileName);
		if(f.exists()){
			f.delete();
			System.out.println("成功地删除了G:\\javase\\io\\下的 hello.txt");
		}else{
			System.out.println("文件不存在");
		}
	}
}