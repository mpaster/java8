/**
 * ��֪һ�����У�f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n),���� n �Ǵ��� 0 ����������f(10)��ֵ��
 * �������� f(n+2)=2*f(n+1)+f(n) ���Եõ���
 * 	1) f(n) = 2*f(n-1) + f(n-2), 2) f(n) = f(n+2) - 2*f(n+1)
 * 	�����ڣ�f(20)=1,f(21)=4����������ѡ�� 2),����֪�ķ���ݹ顣
 */
public class Recursive2{
	
	public static int fn(int n){
		if(n == 20) return 1;
		else if(n == 21) return 4;
		else{
			// ����������
			return fn(n+2) - 2 * fn(n+1);
		}
	}

	public static void main(String[] args){
		System.out.println("Recursive2 �У�");
		System.out.println(Recursive2.fn(10));
	}

}