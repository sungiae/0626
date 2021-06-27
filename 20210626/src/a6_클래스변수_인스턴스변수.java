/*
 * 선언위치
 * 영역 - 클래스 영역 - iv, cv
 *     - 메서드 영역 - lv
 * ------------------------------------------
 * cv와 lv의 차이는 무엇인가
 * 
 * 카드 객체 
 * 속성 - 무늬, 숫자, 폭, 높이
 * 		==> 폭과 높이는 공통  ====> 클래스 변수
 * 		==> 무늬 숫자는 개별적 ====> 인스턴스 변수
 * ------------------------------------------
 * ∴ 인스턴스 - 개별적
 *   클래스 - 공통 - 객체생성 없이 사용가능
 *   
 *   iv 인스턴스 변수는 객체마다 1개씩 있지만
 *   cv는 객체와 별도로 다른 공간에 따로 만들어져 있으므로 객체의 개수와 상관없다
 */
class Card {
	String kind;
	int num;
	static int width=100;
	static int height=250;
}

public class a6_클래스변수_인스턴스변수 {

	public static void main(String[] args) {
		System.out.println(Card.width); // 객체 생성 없이 사용 가능
		
		Card c=new Card();
		
		c.width=200; // 참조변수(c) 사용 -> 가능은 하지만 권장하지 않음
		Card.width=190; //클래스 이름 사용 권장
		
		System.out.println(Card.width);
	}

}
