/*
 * return��
 * ���� ���� �޼��带 �����ϰ� ȣ���� ������ �ǵ��ư���
 */


	


public class a9_return��_��ȯ�� {
	 static void printGugudan(int dan) {
			if(dan>=2 && dan<=9) {
				for(int i=1; i<=9; i++) {
					System.out.printf("%2d * %2d = %2d\n",dan, i ,dan*i);
				}
			}
		}
	public static void main(String[] args) {
//		a_9_return��_��ȯ�� aaa=new a_9_return��_��ȯ��();
//		gugu gu=new gugu();
//		gu.printGugudan(10);
//		gu.printGugudan(9);
		printGugudan(9);
		printGugudan(10);
	}

}
