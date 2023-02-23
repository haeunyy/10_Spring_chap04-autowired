package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* @Component의 세분화 어노테이션의 한 종류로 Service 레이어에서 사용한다. */
@Service /* 이름을 안지어주면 해당 클래스명의 앞글자가 소문자로 지정되어 자동 생성된다. */
public class BookService {

	// 직접적으로 생성하면 강한 결합이 생긴다. -> 생성된 객체를 주입받아서 사용하는 코드로 수정해보자
	/****  private BookDAO booDAO = new BookDAOImpl();  ****/
	/* new BookDAOImpl()와 같은 코드는 bookDAOImpl 클래스와 강한 결합을 가지게 되어 
	 * BookDAOImpl의 변경에 직접적으로 영향을 받게 되므로 결합을 느슨하게 하기 위해 
	 * 의존성을 주입받는 방식을 사용한다. */

	/* BookDAO 타입의 빈 객체를 이 프로퍼티에 자동으로 주입해준다. */
	@Autowired
	private BookDAO bookDAO;
	
	public List<BookDTO> selectAllBooks(){
		return bookDAO.selectBookList();
	}
	
	public BookDTO searchBookBySequence(int sequence) {
		return bookDAO.selectOneBook(sequence);
	}
	
	
}
