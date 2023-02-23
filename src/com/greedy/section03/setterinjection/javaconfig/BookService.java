package com.greedy.section03.setterinjection.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* @Component의 세분화 어노테이션의 한 종류로 Service 레이어에서 사용한다. */


@Service /* 이름을 안지어주면 해당 클래스명의 앞글자가 소문자로 지정되어 자동 생성된다. */
public class BookService {

	/****  private BookDAO booDAO = new BookDAOImpl();  ****/

	
	private BookDAO bookDAO;
	
//	private BookDTO bookDTO;
	
	/* setter 메소드를 이용한 의존성 주입 */
	@Autowired
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	public List<BookDTO> selectAllBooks(){
		return bookDAO.selectBookList();
	}
	
	public BookDTO searchBookBySequence(int sequence) {
		return bookDAO.selectOneBook(sequence);
	}
	
	
}
