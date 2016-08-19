public class ReferenceTransferTest{
	
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap �����a ��ֵΪ��"+dw.a+", b ��ֵΪ��"+dw.b);
		// ֱ�գ��ᱻ���ա��� main �����е� dw �ճ�����ˣ�˵������ͬһ������
		dw = null;
		System.out.println(dw);
	}

	public static void main(String[] args){
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		// dw ���õĸ���Ʒ�����룬����ָ��ͬһ�� DataWrap ����
		ReferenceTransferTest.swap(dw);
		System.out.println("main �����У�������Ľ����a��"+dw.a+",b��"+dw.b);
	}

}

class DataWrap{
	int a;
	int b;
}