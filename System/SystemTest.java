import java.util.Map;

/*
 1.System �����ǰ Java ���������ƽ̨�������޷����� System �ࣩ�������ṩ��һЩ��̬�����;�̬����
 2.��̬������in����׼���룩��out����׼�������err�����������
 3.���þ�̬������getenv(), getenv(String envName), getProperty(), getProperties();
*/
public class SystemTest{
	
	public static void main(String[] args){
		// ��������ϵͳ��������
		Map<String, String> env = System.getenv();
		for(String name:env.keySet()){
			System.out.println(name + "-->" + env.get(name));
		}
		// ָ��ϵͳ��������
		System.out.println("JAVA_HOME ϵͳ������ֵΪ��"+System.getenv("JAVA_HOME"));
	}
}