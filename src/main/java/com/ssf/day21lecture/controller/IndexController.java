package com.ssf.day21lecture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssf.day21lecture.model.Book;
import com.ssf.day21lecture.repo.BookRepo;

@Controller
@RequestMapping
public class IndexController {

    @Autowired
    BookRepo bookRepo;

    @GetMapping("/")
    public ModelAndView getIndex() {
        ModelAndView mav = new ModelAndView("index");
        List<Book> books = bookRepo.findAllBooks(10);
        mav.addObject("books", books);
        return mav;
    }

    @GetMapping("/{id}")
    public String loadId(@PathVariable String id, Model model) {
        Book book = bookRepo.getBook(id);
        model.addAttribute("book", book);
        return "book";
    }

    /*
     *     @GetMapping("/contact/{id}")
    public String loadID(@PathVariable String id, Model model) {
        User user = contactsRepo.getUser(id);
        model.addAttribute("user", user);
        return "contact-by-id";

    }
     */
    
}
