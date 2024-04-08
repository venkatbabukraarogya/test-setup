package venkat.sample.demo.book.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import venkat.sample.demo.book.dto.BookData;

@Service
public class BooksService {

	public List<BookData> getAllBooks() {
		
		return Arrays.asList(
			new BookData(1, "Book1", "Author1"),
			new BookData(1, "Book2", "Author2"),
			new BookData(1, "Book3", "Author3")
		);
		
	}

}
