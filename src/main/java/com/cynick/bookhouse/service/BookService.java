package com.cynick.bookhouse.service;

import java.util.List;

import com.cynick.bookhouse.entity.Book;

public interface BookService {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    
    List<Book> getAllBook(int pageNum,int pageSize);
    
    int saveBooks(List<Book> list);
    
    
}