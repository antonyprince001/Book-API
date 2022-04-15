package com.tw.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("BookRepository")
public interface BookRepository extends JpaRepository<Book, Long> {
}
