package test.dao;

import test.vo.Person;

public interface PersonMapper {
	
	public void insertPerson(Person vo);
	public void deletePerson(int num);

}
