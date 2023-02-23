package com.greedy.section03.setterinjection.javaconfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

//component어노테이션은 세분화된 어노테이션 

/* @Component의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 사용한다. */
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{

	private Map<Integer,BookDTO> bookList;
	
	public BookDAOImpl() {
		bookList = new HashMap<>();	
		bookList.put(1,  new BookDTO(1,123456,"자바의 정석","남궁성","도우",new Date()));
		bookList.put(2,  new BookDTO(2,456789,"고래바의 정석","남고성","도찌",new Date()));
	}
	
	@Override
	public List<BookDTO> selectBookList() {
		return new ArrayList<>(bookList.values());
	}

	@Override
	public BookDTO selectOneBook(int sequence) {
		return bookList.get(sequence);
	}

	
	
	
}
