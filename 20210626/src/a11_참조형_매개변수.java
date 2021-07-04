/* ☆☆☆☆☆☆☆☆☆☆☆ 차이 구분 ☆☆☆☆☆☆☆☆☆☆☆
 * 
 * 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다 (read only)
 * 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다 (read & write)
 * 
 * 참조형 매개변수 - 객체의 주소값을 받는다 (객체를 다룰 수 있는 리모컨을 통째로 받는다)
 * 
 * 
*/
class Data2{
	int x;
}
public class a11_참조형_매개변수 {
	static void change(Data2 d) { // Date2는 ing와 같은 기본형이 아니므로 "참조형"이다
		d.x=1000;
		System.out.println("change() : x = " +d.x);
	}
	public static void main(String[] args) {
		
		
		Data2 d = new Data2();
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
	}

}
