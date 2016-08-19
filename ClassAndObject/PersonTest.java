public class PersonTest{

	public static void main(String[] args){
		Person p = new Person();
		p.name = "Peter";
		p.age = 12;
		p.say("我是Peter,今年12岁,很高兴认识你们！");

		Person p2 = p;
		System.out.println(p==p2);
	}
}