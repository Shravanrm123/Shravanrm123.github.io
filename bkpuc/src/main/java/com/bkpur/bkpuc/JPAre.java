package com.bkpur.bkpuc;



import java.util.List;

public interface JpaRepository<T1, T2, BookEntity> {

    List<BookEntity> findAll();

}