import java.util.Date;
/*
 Date �࣬�� Date() �� Date(long time) �⣬���๹������4���������Ƽ�ʹ��;
 ���õķ�����boolean before(Date when), boolean after(Date when), long getTime() �� void setTime(long time);
*/
public class DateTest{
	public static void main(String[] args){
		Date date = new Date();
		
		System.out.println("���ڵı���ʱ��Ϊ��"+date);
		System.out.println("���ھ��� GMT 1970��1��1��00:00:00 �ĺ�����Ϊ��"+ date.getTime());
	}
}