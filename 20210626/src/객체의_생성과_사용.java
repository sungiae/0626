/*
 * 1. �������� (������) �����	     Tv t;
 * 2. ��ü�� ����			         new Tv();
 * 3. ���Կ����ڷ� ���������� ��ü ����  t=new Tv();
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
public class ��ü��_������_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t; // t=�������� (Tv�� ������)
		t=new Tv(); // new Tv() = ��ü�� ����
		t.channel=7;
		t.volume=10;
		int a=t.channel;
		t.channeldown();
		System.out.println(t.channel);
		System.out.println(t.volume);
		System.out.println("a="+a);
	}

}
