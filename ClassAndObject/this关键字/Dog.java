public class Dog{

	private void jump(){
		System.out.println("����ִ�� jump ����");
	}

	public void run(){
		// this �ǵ��ø÷����Ķ���
		// ��ʹ����ʡ���� this ��������Ȼ���ڣ���Ĭ��ʹ�� this
		this.jump();
		System.out.println("����ִ�� run ����");
	}
}