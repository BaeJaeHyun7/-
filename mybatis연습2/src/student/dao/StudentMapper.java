package student.dao;

import java.util.ArrayList;

import student.vo.Student;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface StudentMapper {
	//Student 객체 저장
	public int insertStudent(Student vo);
	//전체 읽기
	public ArrayList<Student> selectStudent();
	//삭제
	public int deleteStudent(String id);
	//수정
	public int updateStudent(Student vo);
	//이름으로 검색
	public ArrayList<Student> searchStudent(String name);

}
