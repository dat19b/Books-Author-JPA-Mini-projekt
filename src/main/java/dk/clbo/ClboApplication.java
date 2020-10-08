package dk.clbo;

import dk.clbo.controller.BookStoreController;
import dk.clbo.model.Author;
import dk.clbo.repository.AuthorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ClboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClboApplication.class, args);

        //AuthorRepository ar;
        //BookStoreController bc = new BookStoreController(ar);
    }

}
