/**
 * ��֪һ�����У�f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),���� n �Ǵ��� 0 ����������f(10)��ֵ��
 * �������� f(n+2)=2*f(n+1)+f(n) ���Եõ���
 * 1) f(n) = 2*f(n-1) + f(n-2), 2) f(n) = f(n+2) - 2*f(n+1)
 * �����ڣ�f(0)=1,f(1)=4����������ѡ�� 1),����֪�ķ���ݹ顣
 */
public class Recursive{
	
	public static int fn(int n){
		if(n == 0) return 1;
		else if(n == 1) return 4;
		else{
			// ����������
			return 2 * fn(n-1) + fn(n-2);
		}
	}

	public static void main(String[] args){
		System.out.println(Recursive.fn(10));
	}

}