package com.ssf.day21lecture.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ssf.day21lecture.model.Book;

@Repository
public class BookRepo {
    @Autowired
    private JdbcTemplate template;

    /*
     * public void findBooksByTitle(String keyword) {
     * String toSearch = "%" + keyword + "%";
     * SqlRowSet rs = template.queryForRowSet(Queries.SQL_SELECT_BOOK_BY_TITLE,
     * toSearch, 10, 0);
     * 
     * while (rs.next()) {
     * String bookId = rs.getString("book_id");
     * String title = rs.getString("title");
     * float rating = rs.getFloat("rating");
     * int pages = rs.getInt("pages");
     * System.out.printf("%s, %s, %d, %.3f", bookId, title, pages, rating);
     * }
     * 
     * System.out.println("\n\nQuery completed");
     * }
     */

    /*
     * public void findBooksByRating(float ratingSearch, String formatSearch) {
     * SqlRowSet rs = template.queryForRowSet(Queries.SQL_GET_RATING, ratingSearch,
     * formatSearch);
     * while (rs.next()) {
     * String bookId = rs.getString("book_id");
     * String title = rs.getString("title");
     * float rating = rs.getFloat("rating");
     * String format = rs.getString("format");
     * System.out.printf("%s, %s, %.3f, %s\n", bookId, title, rating, format);
     * }
     * System.out.println("\n\nSecond query completed");
     * }
     * 
     */

    public List<Book> findAllBooks(int limit) {
        SqlRowSet rs = template.queryForRowSet(Queries.SQL_GET_ALL_BOOKS, limit);
        List<Book> books = new ArrayList<>();
        while (rs.next()) {
            String title = rs.getString("title");
            String authors = rs.getString("authors");
            String id = rs.getString("book_id");
            Book book = new Book();
            book.setTitle(title);
            book.setAuthors(authors);
            book.setBookId(id);
            books.add(book);
            System.out.printf("%s, %s, %s\n", title, authors, id);
        }

        return books;
    }

    public Book getBook(String id) {
        SqlRowSet rs = template.queryForRowSet(Queries.SQL_GET_BOOK_BY_ID, id);
        Book book = new Book();
        while (rs.next()) {
            String title = rs.getString("title");
            String authors = rs.getString("authors");
            String description = rs.getString("description");
            float rating = rs.getFloat("rating");
            book.setTitle(title);
            book.setAuthors(authors);
            book.setDescription(description);
            book.setRating(rating);
        }
        return book;
    }
}