public class PersonTest{

	public static void main(String[] args){
		Person p = new Person();
		p.name = "Peter";
		p.age = 12;
		p.say("����Peter,����12��,�ܸ�����ʶ���ǣ�");

		Person p2 = p;
		System.out.println(p==p2);
	}
}