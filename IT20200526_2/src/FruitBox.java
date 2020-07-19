//제네릭
public class FruitBox<T> {
    //박스에 담긴 과일(사과,포도)
	private T object; 
	
	public T get() {
		return object;
	}
	
	public void set(T obj) {
		object = obj;
	}
	
	public static void main(String[] args) {
		//사용하는 시점에 선택해서 사용, 사용할때 타입지정
		FruitBox<Apple> box = new FruitBox<Apple>();
		box.set(new Apple());
		System.out.println(box.get().getName());
		
		
		FruitBox<Grape> gBox = new FruitBox<Grape>();
		gBox.set(new Grape());
		System.out.println(gBox.get().getName());
	}
}
