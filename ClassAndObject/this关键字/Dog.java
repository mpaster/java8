public class Dog{

	private void jump(){
		System.out.println("正在执行 jump 方法");
	}

	public void run(){
		// this 是调用该方法的对象
		// 即使这里省略了 this ，主调依然存在，即默认使用 this
		this.jump();
		System.out.println("正在执行 run 方法");
	}
}