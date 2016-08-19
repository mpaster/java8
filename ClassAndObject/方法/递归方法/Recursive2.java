/**
 * 已知一个数列：f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n),其中 n 是大于 0 的整数，求f(10)的值。
 * 分析：由 f(n+2)=2*f(n+1)+f(n) 可以得到：
 * 	1) f(n) = 2*f(n-1) + f(n-2), 2) f(n) = f(n+2) - 2*f(n+1)
 * 	但由于，f(20)=1,f(21)=4，所以我们选择 2),即已知的方向递归。
 */
public class Recursive2{
	
	public static int fn(int n){
		if(n == 20) return 1;
		else if(n == 21) return 4;
		else{
			// 调用它本身
			return fn(n+2) - 2 * fn(n+1);
		}
	}

	public static void main(String[] args){
		System.out.println("Recursive2 中：");
		System.out.println(Recursive2.fn(10));
	}

}