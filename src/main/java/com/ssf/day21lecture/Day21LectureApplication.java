package com.ssf.day21lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ssf.day21lecture.repo.BookRepo;

@SpringBootApplication
public class Day21LectureApplication implements CommandLineRunner {

	@Autowired
	private BookRepo bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(Day21LectureApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// bookRepo.findBooksByTitle("murder");
		// System.out.println("------------------------------");
		// bookRepo.findBooksByRating(4f, "paperback");
		// System.out.println("------------------");
		bookRepo.findAllBooks(10);

	}

}
