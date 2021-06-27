
/*
 * 어디에 선언 했는지, 즉 선언 위치에 따라서 변수는 3종류로 나뉜다
 * 
 * 영역에 따른 분류
 * 1. 클래스 영역 (iv, cv)
 * 2. 메서드 영역 (lv)
 * 
 * 
 * 변수의 종류
 * 1. 인스턴스 변수
 * 2. 클래스 변수
 * 3. 지역변수 - 메서드 내에서만 유지 / 메서드 종료시 자동 제거
 * 
 * 
 * 
 * 클래스 영역 - 선언문만 가능 [변수 선언] [메서드 선언= void method() ]
 * 			  System.out.print() / y=x+3; 등등 불가능
 * 메서드 영역 - 메서드 선언, 정의 가능
 * 
 * 
 * 
 * ***** 인스턴스 변수의 생성시기가 언제인가?
 * 			= 인스턴스가 생성되었을 때
 * 			= 객체가 생성되었을 때
 * ==> 객체는 iv(인스턴스 변수)를 묶어 놓은 것
 * 
 * +. cv는 iv와 다르게 객체생성이 필요없다
 * 
 */
class Variables{
	int iv;			// 인스턴스 변수                
	static int cv;  // 클래스 변수 = static + iv    
												 
	void method() { //                           
		int lv=0;   // 지역변수      
		System.out.println(123);
	}               //                           
}
public class a5_선언위치에_따른_변수종류 {

	public static void main(String[] args) {
		Variables v=new Variables();
		System.out.println(v.iv);
		System.out.println(v.cv);
		v.method();
	}

}
