package opensource.casado.bookshelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BookshelfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookshelfApplication.class, args);
	}

}
