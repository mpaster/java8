public class PrimitiveTransferTest{
	
	public static void swap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap �����a ��ֵΪ��"+a+", b ��ֵΪ��"+b);
	}

	public static void main(String[] args){
		int a = 6;
		int b = 9;
		// a, b �ĸ���Ʒ�����룬ʵ��ֵ����Ӱ��
		PrimitiveTransferTest.swap(a, b);
		System.out.println("main �����У�������Ľ����a��"+a+",b��"+b);
	}

}