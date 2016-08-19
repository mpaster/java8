public class PersonTest{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println("p1.name="+p1.name+",p2.name="+p2.name+",eyeNum="+Person.eyeNum);
		
		p1.name = "Peter";
		System.out.println("p1.name="+p1.name+",p2.name="+p2.name+",eyeNum="+Person.eyeNum);

		p2.name = "Teddy";
		System.out.println("p1.name="+p1.name+",p2.name="+p2.name+",eyeNum="+Person.eyeNum);
	}
}