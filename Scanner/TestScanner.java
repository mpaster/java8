import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner{
	public static void main(String[] args){
		try{
			File f = new File("file.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}catch(FileNotFoundException e){
			System.out.println("未找到相关文件");
		}
		
	}

}