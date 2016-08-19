public class Singleton{
	private static Singleton instance;// 3.被静态方法访问的成员变量必须为静态变量

	private Singleton(){};// 1.最大特点就是构造器访问权限为：private
	
	public static Singleton getInstance(){// 2.通过方法来创建实例，调用此方法之前不可能有实例，故必须为静态方法
		if(instance == null)
			instance = new Singleton();
		return instance;
	}

	public static void main(String[] args){
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}
}