package com.ssf.day21lecture.repo;

public class Queries {

    /*
     * public static final String SQL_SELECT_BOOK_BY_TITLE = """
     * select book_id, title, authors, description, rating, image_url, pages
     * from book2018
     * where title like ?
     * limit ?
     * offset ?
     * """;
     * 
     * public static final String SQL_GET_RATING = """
     * select book_id, title, authors, description, rating, format
     * from book2018
     * where rating >= ? and
     * format like ?
     * 
     * """;
     */

    public static final String SQL_GET_ALL_BOOKS = """
            select book_id, title, authors, description, rating
            from book2018
            order by title asc
            limit ?
            """;
    
    public static final String SQL_GET_BOOK_BY_ID = """
            select book_id, title, authors, description, rating
            from book2018
            where book_id = ?
            """;

}
