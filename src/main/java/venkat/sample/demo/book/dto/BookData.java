package venkat.sample.demo.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookData {
	
	private int id;
	private String name;
	private String author;

}
