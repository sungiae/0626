/*
 * 1. 참조변수 (리모컨) 만들기	     Tv t;
 * 2. 객체를 생성			         new Tv();
 * 3. 대입연산자로 참조변수와 객체 연결  t=new Tv();
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
public class 객체의_생성과_사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t; // t=참조변수 (Tv의 리모컨)
		t=new Tv(); // new Tv() = 객체의 생성
		t.channel=7;
		t.volume=10;
		int a=t.channel;
		t.channeldown();
		System.out.println(t.channel);
		System.out.println(t.volume);
		System.out.println("a="+a);
	}

}
