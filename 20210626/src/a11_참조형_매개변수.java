/* �١١١١١١١١١١� ���� ���� �١١١١١١١١١١�
 * 
 * �⺻�� �Ű����� - ������ ���� �б⸸ �� �� �ִ� (read only)
 * ������ �Ű����� - ������ ���� �а� ������ �� �ִ� (read & write)
 * 
 * ������ �Ű����� - ��ü�� �ּҰ��� �޴´� (��ü�� �ٷ� �� �ִ� �������� ��°�� �޴´�)
 * 
 * 
*/
class Data2{
	int x;
}
public class a11_������_�Ű����� {
	static void change(Data2 d) { // Date2�� ing�� ���� �⺻���� �ƴϹǷ� "������"�̴�
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
