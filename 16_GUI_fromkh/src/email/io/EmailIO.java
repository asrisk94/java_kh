package email.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import email.model.vo.EmailVO;

/**
 * 파일에 접근해서 데이터를 저장, 조회, 수정, 삭제
 * 
 *
 */
public class EmailIO {

	private String fileName = "email.dat";

	public void saveEmail(EmailVO vo) {
		
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream(fileName));
				){
			
			oos.writeObject(vo);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
