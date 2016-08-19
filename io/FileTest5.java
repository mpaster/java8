import java.io.File;

/* 列出指定目录下（包括子目录）的全部内容 */
public class FileTest5{
	
	public static void main(String[] args){
		String fileName = "G:" + File.separator + "javase" 
				+ File.separator + "io" + File.separator;
		File f = new File(fileName);
		print(f);
	}

	public static void print(File f){
		if( f!=null ){
			if(f.isDirectory()){
				File[] fs = f.listFiles();
				if(fs != null){
					for(int i = 0; i < fs.length; i++){
						// 递归调用
						print(fs[i]);
					}
				}
			}else{
				System.out.println(f);
			}
		}
	}
}