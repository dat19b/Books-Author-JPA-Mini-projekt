package dk.clbo.controller;

import dk.clbo.model.Author;
import dk.clbo.model.Book;
import dk.clbo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookStoreController {

    private AuthorRepository authorRepository;

    public BookStoreController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @GetMapping("/")
    public String index(){

        System.out.println(authorRepository.findById(1L).get().getFirstName());// data fra database
        System.out.println(authorRepository.findById(1L).get().getLastName());

        for (Book b: authorRepository.findById(1L).get().getBooks()) {
            System.out.println(b.getTitle());
            System.out.println(b.getAuthor().getFirstName());
            System.out.println(b.getAuthor().getLastName());
        }


        return "index";
    }
}
