/*
 * 1. �������� (������) �����	     Tv t;
 * 2. ��ü�� ����			         new Tv();
 * 3. ���Կ����ڷ� ���������� ��ü ����  t=new Tv();
 * 
 * 
 * �������� ������ ��ü�� ����� �� ����
 * �ν��Ͻ� �ּҸ� ���������� ����
 * 
 * Tv t1=new Tv();
 * Tv t2=new Tv();
 * ==> ���� �ٸ� �ּ��� �ν��Ͻ� ����
 * 
 * t2=t1;
 * ==> t2�� t1�� �ν��Ͻ� �ּҸ� ������
 * ====> ������ t2 �ν��Ͻ��� ���Ұ�
         GC (������ �÷���) (û�Һ�)�� �ֱ������� �޸𸮸� Ȯ���ϴٰ� �������ʴ� ��ü���� �����
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
public class a1_��ü��_������_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1; // t=�������� (Tv�� ������)
		Tv t2; 
		t1=new Tv(); // new Tv() = ��ü�� ����
		t2=new Tv();
		t1.channel=7;
		t2.channel=5;
		t1.volume=10;
		t2.volume=9;
		t2.channeldown();
		System.out.println("=�ϱ���"+ t2.channel);
		t2=t1;
		t1.channeldown();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}

}
