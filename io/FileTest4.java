import java.io.File;

/* 列出指定目录的全部文件(包括隐藏文件) */
public class FileTest4{
	
	public static void main(String[] args){
		String fileName = "D:" + File.separator;
		File f = new File(fileName);
		File[] fs = f.listFiles();
		for(int i = 0; i < fs.length; i++){
			System.out.println(fs[i]); // listFiels 输出的是完全路径
		}

		// 使用isDirectory判断一个指定的路径是否为目录
		// boolean isDirectory(); 如，f.isDirectory();
	}
}