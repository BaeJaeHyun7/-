
public class Truck extends Vehicle {

	double maxLoad; //�ִ� ���緮
	
	public Truck(int w, int s, double max) {
		
		super(); // �����ڿ��� �����ִ� ���۱���(�θ� ����) -> Vehicle�� ������(Vehicle();)
		//��Ӱ� ������� �׻� �����ִ� ����
		//�θ�Ŭ������ ã�°Ŵ�
		//super�� �θ� super();�� ������
		//�����ڴ� ��ü�� ����� �����̴�
		System.out.println("Truck ������ ȣ��");
		numberOfWheel = w;
		numberOfSeat = s;
		maxLoad = max;
	}
	//ȭ���� ��ĭ�� �ƴ� ���
	public void load() {
		
		
	}
	//Vehicle(�θ�)�� start�޼ҵ带 Truck�� �������̵��ؼ� ������ �� ���
	  @Override
	//������̼�(����̴� annotation��� �θ���) : �������̵� ������̼�
	public void start() {
		System.out.println("Ʈ���� ��߱��");
		
	} 
	 
	
	
}
