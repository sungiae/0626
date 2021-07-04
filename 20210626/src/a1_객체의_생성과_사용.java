/*
 * 1. 참조변수 (리모컨) 만들기	     Tv t;
 * 2. 객체를 생성			         new Tv();
 * 3. 대입연산자로 참조변수와 객체 연결  t=new Tv();
 * 
 * 
 * 리모컨이 없으면 객체를 사용할 수 없다
 * 인스턴스 주소를 참조변수에 저장
 * 
 * Tv t1=new Tv();
 * Tv t2=new Tv();
 * ==> 각각 다른 주소의 인스턴스 생성
 * 
 * t2=t1;
 * ==> t2가 t1의 인스턴스 주소를 가진다
 * ====> 기존의 t2 인스턴스는 사용불가
         GC (가비지 컬렉터) (청소부)가 주기적으로 메모리를 확인하다가 사용되지않는 객체들을 지운다
 * 
 */

class Tv{
	int channel;
	int volume;

	void channeldown() {
		channel --;
	}
	void channelUp() {
		channel ++;
	}
}
public class a1_객체의_생성과_사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1; // t=참조변수 (Tv의 리모컨)
		Tv t2; 
		t1=new Tv(); // new Tv() = 객체의 생성
		t2=new Tv();
		t1.channel=7;
		t2.channel=5;
		t1.volume=10;
		t2.volume=9;
		t2.channeldown();
		System.out.println("=하기전"+ t2.channel);
		t2=t1;
		t1.channeldown();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}

}
