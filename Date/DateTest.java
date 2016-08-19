import java.util.Date;
/*
 Date 类，除 Date() 和 Date(long time) 外，其余构造器（4个）不再推荐使用;
 可用的方法：boolean before(Date when), boolean after(Date when), long getTime() 和 void setTime(long time);
*/
public class DateTest{
	public static void main(String[] args){
		Date date = new Date();
		
		System.out.println("现在的本地时间为："+date);
		System.out.println("现在距离 GMT 1970年1月1日00:00:00 的毫秒数为："+ date.getTime());
	}
}