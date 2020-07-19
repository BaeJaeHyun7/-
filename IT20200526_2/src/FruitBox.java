//���׸�
public class FruitBox<T> {
    //�ڽ��� ��� ����(���,����)
	private T object; 
	
	public T get() {
		return object;
	}
	
	public void set(T obj) {
		object = obj;
	}
	
	public static void main(String[] args) {
		//����ϴ� ������ �����ؼ� ���, ����Ҷ� Ÿ������
		FruitBox<Apple> box = new FruitBox<Apple>();
		box.set(new Apple());
		System.out.println(box.get().getName());
		
		
		FruitBox<Grape> gBox = new FruitBox<Grape>();
		gBox.set(new Grape());
		System.out.println(gBox.get().getName());
	}
}
