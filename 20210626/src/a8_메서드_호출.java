/*
 * �޼����� ȣ��
 * - �޼����̸�(��1, ��2, ...);
 * 
 * 
 * 
 * �Ű����� - �߰����� �����ϴ� ���� (parameter, �Ķ����)
 */
class AddClass{
	long max(long a, long b) {
		return a>b ? a : b;
	}
	long add(long a, long b) {
		return a+b;
	}
}
public class a8_�޼���_ȣ�� {
static long add(long a, long b) {
	return a+b;
}
	public static void main(String[] args) {
		AddClass a=new AddClass();
		long high=a.max(2,3);
		System.out.println(high);
		AddClass add=new AddClass();
		System.out.println(add.add(2,3));
		System.out.println("add:"+a);
	}

}
