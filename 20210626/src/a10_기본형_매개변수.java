/* �١١١١١١١١١١� ���� ���� �١١١١١١١١١١�
 * 
 * �⺻�� �Ű����� - ������ ���� �б⸸ �� �� �ִ� (read only)
 * ������ �Ű����� - ������ ���� �а� ������ �� �ִ� (read & write)
 * 
 * ȣ�� ����
 * ex.
 * main
 * 		x=10
 * main - change
 * 		x=100
 * main (�޼���� �������� ���� ������)
 * 		x=10 (���������� �������鼭 �ٽ� ���� ���� 10���� ���ƿ´�)
 */
class Data {
	int x;
}
	
public class a10_�⺻��_�Ű����� {
	static void change(int a) { // �⺻�� �Ű�����
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
