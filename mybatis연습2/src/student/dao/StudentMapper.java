package student.dao;

import java.util.ArrayList;

import student.vo.Student;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface StudentMapper {
	//Student ��ü ����
	public int insertStudent(Student vo);
	//��ü �б�
	public ArrayList<Student> selectStudent();
	//����
	public int deleteStudent(String id);
	//����
	public int updateStudent(Student vo);
	//�̸����� �˻�
	public ArrayList<Student> searchStudent(String name);

}
