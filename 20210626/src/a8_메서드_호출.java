/*
 * 메서드의 호출
 * - 메서드이름(값1, 값2, ...);
 * 
 * 
 * 
 * 매개변수 - 중간에서 전달하는 역할 (parameter, 파라미터)
 */
class AddClass{
	long max(long a, long b) {
		return a>b ? a : b;
	}
	long add(long a, long b) {
		return a+b;
	}
}
public class a8_메서드_호출 {
static long add(long a, long b) {
	return a+b;
}
	public static void main(String[] args) {
		AddClass a=new AddClass();
		long high=a.max(2,3);
		System.out.println(high);
		AddClass add=new AddClass();
		System.out.println(add.add(2,3));
		System.out.println("add:"+a);
	}

}
