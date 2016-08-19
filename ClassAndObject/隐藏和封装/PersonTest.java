public class PersonTest{
	
	public static void main(String[] args){
		Person person = new Person();
		person.setName("a");
		person.setName("aaaaaaaaaaaaaaaaa");
		person.setName("Peter");
		System.out.println("name:" + person.getName());

		person.setAge(-1);
		person.setAge(101);
		person.setAge(99);
		System.out.println("age:" + person.getAge());
	}
	
}