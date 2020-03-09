package com.phn.bootjpa.repository;

import com.phn.bootjpa.model.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *  CrudRepository里面的泛型，第一个为实体类、第二个是主键的类型
 *  由于CrudRepository里面以及有些接口了，如deleteAll、findOne等
 *  也可以根据自己的情况来实现自己的接口
 * @author PengHenan
 * @create  2020-03-03 0:53:35
 */
public interface BookRepository extends CrudRepository<Book,Integer> {

    @Query("from Book")
    List<Book> getBookAll();

}
