package com.greedy.section02.constinjection.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* @Component의 세분화 어노테이션의 한 종류로 Service 레이어에서 사용한다. */
@Service /* 이름을 안지어주면 해당 클래스명의 앞글자가 소문자로 지정되어 자동 생성된다. */
public class BookService {

	/* 생성자 주입의 장점 
	 * 1. 필드에 final 키워드 사용이 가능해지므로 변경 불가능하게 사용할 수 있다. (또다른 객체가 들어가는 의도치않은 오류발생 막을수있다)
	 * 2. 순호나 참조 방지 (참조를 양쪽에서 만들어서 빙글빙글 오류가 발생한다.)
	 * ( 필드 주입이나 세터 주입은 메소드 실행 시점에만 오류가 나지만 생성자 주입의 경우 어플리케이션 실행 시점에서 확인 가능 
	 * 3. DI 컨테이너와의 결합도가 낮기 때문에 테스트 하기 좋다. (스프링 컨테이너 없이 테스트를 할 수 있다. ) 개발 환경 그러니까 DI가 아닌 환경으로 변경해야할 때 다른 방법은 코드를 모두 수정해야하는 불편함이있따. */
	
	/****  private BookDAO booDAO = new BookDAOImpl();  ****/

	private final BookDAO bookDAO;
	
//	public BookService() {}
	
	/* BookDAO 타입의 빈 객체를 생성자로 전달 받아 주입해준다. */
	/* @Autowired를 주석해도 정상 작동하는 이유은 스프링 4.3 버전 이후로는 생성자 주입방식을 사용할 때 
	 * 생성자가 한 개 뿐이라면 해당 생성자 에 어노테이션을 생략해도 자동으로 주입해준다. 
	 * 단, 기본생성자를 추가하면 오류가 나므로 그 때는 명시적으로 작성을 해주어야한다. */
//	@Autowired
	public BookService(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	public List<BookDTO> selectAllBooks(){
		return bookDAO.selectBookList();
	}
	
	public BookDTO searchBookBySequence(int sequence) {
		return bookDAO.selectOneBook(sequence);
	}
	
	
}
