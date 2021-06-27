/*
 * Tv[] tvArr new Tv[3] => 객체가 아니라 Tv타입의 참조변수 3개를 의미한다
 * 
 * 그러므로 따로 객체를 만들어야한다
 * tvArr[0] = new Tv();
 * tvArr[1] = new Tv();
 * tvArr[2] = new Tv();
 */
public class a3_객체배열 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		tvArr[0]=new Tv();
		tvArr[0].channel=7;
	}

}
