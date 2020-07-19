package Chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("song.txt");
			fos = new FileOutputStream("copySong.txt");
			int data;
			while (true) {
				data = fis.read();
				//data�� ���� -1�� ���� ���Ͽ��� �����͸� �о����� �����Ͱ� ���� ���
				//eof -> end of file
				if(data == -1) break;
				fos.write(data);
			System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			 e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
