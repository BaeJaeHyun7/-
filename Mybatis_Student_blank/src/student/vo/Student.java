package student.vo;

/**
 * ���� ������ ������ VO Ŭ����
 */
public class Student {
	private int id;				//�й�
	private String name;			//�̸�
	private int kor;				//��������
	private int eng;				//��������
	private int mat;				//��������
	public Student() {
		super();
	}
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public Student(int id, String name, int kor, int eng, int mat) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
	

}
