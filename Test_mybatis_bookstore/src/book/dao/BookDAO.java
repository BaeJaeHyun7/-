package book.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import book.vo.BookVO;

/**
 * DB���� ó�� Ŭ����
 */
public class BookDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	/**
	 * �������� ����
	 * @param vo ������ ���� ����
	 * @return ����� ���ڵ� ��
	 */
	public int insertBook(BookVO vo) {
		SqlSession ss = null;
		int result = 0;
		
		try {
			ss = factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			result = mapper.insertBook(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}

	/**
	 * ��ü ���� ��� �б�
	 * @return ���� ���
	 */
	public ArrayList<BookVO> listAll() {
		SqlSession ss = null;
		ArrayList<BookVO> list = null;
		
		try {
			ss = factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			list = mapper.listAll();
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
	/**
	 * ��ȣ�� �������� �б�
	 * @param bnum �˻��� ��ȣ
	 * @return ���� ���� 
	 */
	public BookVO getBook(int bnum) {
		SqlSession ss = null;
		BookVO vo = null;
		
		try {
			ss = factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			vo = mapper.getBook(bnum);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return vo;
	}

	/**
	 * ��ȣ�� �����ϱ�
	 * @param bnum ������ ��ȣ
	 * @return ������ ���ڵ� ��
	 */
	public int deleteBook(int bnum) {
		SqlSession ss = null;
		int cnt = 0;
		
		try {
			ss = factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			cnt = mapper.deleteBook(bnum);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return cnt;
	}
	
	/**
	 * ��ȣ�� ���� ���� �����ϱ�
	 * @param vo ������ ������ ��� ��ü
	 * @return ������ ���ڵ� ��
	 */
	public int updateBook(BookVO vo) {
		SqlSession ss = null;
		int cnt = 0;
		try {
			ss = factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			cnt = mapper.updateBook(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return cnt;
	}
	
	/**
	 * �˻��ϱ�
	 * @param text �˻���
	 * @return �˻� ���
	 */
	public ArrayList<BookVO> searchBook(String text) {
		SqlSession ss = null;
		ArrayList<BookVO> list = null;
		
		try {
			ss = factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			list = mapper.searchBook(text);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;		
	}

}
