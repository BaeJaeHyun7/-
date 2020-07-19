import java.util.ArrayList;

public class SchoolManager {
	
	ArrayList<Human> list = new ArrayList<Human>();
	
	public boolean insertHuman(Human h) {
		for(Human arr : list) {
			if (arr.getSn().equals(h.getSn())) {
				return false;
			}
		}
		
		if (h instanceof Student) {
			Student student1 = (Student)h;
			for(Human arr : list) {
				if (arr instanceof Student) {
					Student student2 = (Student)arr;
					if (student1.getSsn().equals(student2.getSsn())) {
						return false;
					}
				}
			}
		}
		
		list.add(h);
		return true;		
	}
	
	public void printAll() {
		for(Human arr : list) {
			arr.print();
		}
	}
	
	public Human findHuman(String sn) {
		
		for(Human arr : list) {
			if (arr.getSn().equals(sn)) {
				return arr;
			}
		}return null;
		
	}
	
public boolean deleteHuman(Human h) {
		
		for(Human arr : list) {
			if (arr.equals(h)) {
				list.remove(h);
				return true;
			}
		}return false;
		
	}
	
	
	

}
