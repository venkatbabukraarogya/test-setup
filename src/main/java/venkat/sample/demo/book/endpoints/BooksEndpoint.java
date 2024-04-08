package venkat.sample.demo.book.endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import venkat.sample.demo.book.dto.BookData;
import venkat.sample.demo.book.services.BooksService;

@Slf4j
@RestController
@RequestMapping(path = "/books")
public class BooksEndpoint {
	
	@Autowired
	private BooksService booksSvc;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookData> getAll() {
        log.debug("Entering getAll");
        return booksSvc.getAllBooks();
    }

}
