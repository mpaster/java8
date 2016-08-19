import java.util.Map;

/*
 1.System 类代表当前 Java 程序的运行平台（程序无法创建 System 类），该类提供了一些静态变量和静态方法
 2.静态变量：in（标准输入），out（标准输出），err（错误输出）
 3.常用静态方法：getenv(), getenv(String envName), getProperty(), getProperties();
*/
public class SystemTest{
	
	public static void main(String[] args){
		// 遍历所有系统环境变量
		Map<String, String> env = System.getenv();
		for(String name:env.keySet()){
			System.out.println(name + "-->" + env.get(name));
		}
		// 指定系统环境变量
		System.out.println("JAVA_HOME 系统变量的值为："+System.getenv("JAVA_HOME"));
	}
}