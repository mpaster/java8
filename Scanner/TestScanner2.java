import java.util.Scanner;

public class TestScanner2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		
		/*
		sc.useDelimiter("\n");// 用换行符作为分隔符
		while(sc.hasNext()){
			System.out.println("刚从键盘输入了："+sc.next());
		}
		*/
	}

}