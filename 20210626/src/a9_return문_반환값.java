/*
 * return문
 * 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다
 */


	


public class a9_return문_반환값 {
	 static void printGugudan(int dan) {
			if(dan>=2 && dan<=9) {
				for(int i=1; i<=9; i++) {
					System.out.printf("%2d * %2d = %2d\n",dan, i ,dan*i);
				}
			}
		}
	public static void main(String[] args) {
//		a_9_return문_반환값 aaa=new a_9_return문_반환값();
//		gugu gu=new gugu();
//		gu.printGugudan(10);
//		gu.printGugudan(9);
		printGugudan(9);
		printGugudan(10);
	}

}
