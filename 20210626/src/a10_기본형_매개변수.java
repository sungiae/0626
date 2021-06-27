/* ☆☆☆☆☆☆☆☆☆☆☆ 차이 구분 ☆☆☆☆☆☆☆☆☆☆☆
 * 
 * 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다 (read only)
 * 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다 (read & write)
 * 
 * 호출 스택
 * ex.
 * main
 * 		x=10
 * main - change
 * 		x=100
 * main (메서드와 지역변수 같이 없어짐)
 * 		x=10 (지역변수가 없어지면서 다시 원래 값인 10으로 돌아온다)
 */
class Data {
	int x;
}
	
public class a10_기본형_매개변수 {
	static void change(int a) { // 기본형 매개변수
		a=1000;
		System.out.println("change : "+a);
	}
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() x = "+d.x);
		
		change(d.x);

		System.out.println(d.x);
	}

}
