package Chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("Image.jpg");
			fos = new FileOutputStream("copyImage.jpg");
			
			int count;
			byte[] buffer = new byte[50];
			
			while (true) {
				//byte[]�� �Ű������� ����� read()�� ���� ������ ũ�⸦ ��ȯ�Ѵ�.
				count = fis.read(buffer);
				if(count < buffer.length) {
					for(int i = 0; i < count; i++) 
				     fos.write(buffer[i]);		
				     break;
				}
					fos.write(buffer);
			}
				
		
			}catch (FileNotFoundException e) {
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
