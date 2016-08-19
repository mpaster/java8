public class Singleton{
	private static Singleton instance;// 3.����̬�������ʵĳ�Ա��������Ϊ��̬����

	private Singleton(){};// 1.����ص���ǹ���������Ȩ��Ϊ��private
	
	public static Singleton getInstance(){// 2.ͨ������������ʵ�������ô˷���֮ǰ��������ʵ�����ʱ���Ϊ��̬����
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