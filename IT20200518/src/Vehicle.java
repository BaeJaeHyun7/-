
public class Vehicle {
	
	int numberOfWheel;  //������ ��
	int numberOfSeat; //�¼��� ��
	double weight; //������ ����
	
	public Vehicle() {
		super();//�����ִ� ���� Object();
		System.out.println("Vehicle ������ ȣ��");
	}
	//������ ��߽�Ű�� ���
	public void start() {
		System.out.println("Vehicle ��߱��");
		
	} 
	//������ ������Ű�� ���
	public void stop() {
	 System.out.println("Ʈ���� �������");	
	} 

}
