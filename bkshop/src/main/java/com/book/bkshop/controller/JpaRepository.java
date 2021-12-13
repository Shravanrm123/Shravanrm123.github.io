package com.book.bkshop.controller;

import java.util.List;

public interface JpaRepository<T1, T2, BookEntity> {

    List<BookEntity> findAll();

}
