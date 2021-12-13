package com.book.bkshop.controller;

import com.book.bkshop.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long,Book> {
}