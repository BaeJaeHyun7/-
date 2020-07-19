import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("Image");
			fos = new FileOutputStream("copyImage");
			byte []buffer = new byte[50];
			int count;
			
			while (true) {
				count = fis.read();
				if (count < buffer.length) {
					for (int i = 0; i < count; i++) {
						fos.write(buffer[i]);
						
					}
				}
				fos.write(count);
							
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
