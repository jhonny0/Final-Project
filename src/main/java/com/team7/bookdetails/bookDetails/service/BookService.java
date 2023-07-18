package com.team7.bookdetails.bookDetails.service;

import com.team7.bookdetails.bookDetails.model.Book;

public interface BookService {
    Book saveBook(Book book);
    Book getBookByIsbn(String isbn);
}