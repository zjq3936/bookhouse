package com.cynick.bookhouse.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cynick.bookhouse.entity.Book;
/**
 * 
 * @author CyNick
 * @date 2018年5月4日
 */
@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    
    List<Book> getAll(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);
    
    List<Book> getBookByBookNameAndSourceUrlAndAuthor(Book book);
    
    int getCount();
    
    int saveBooks(List<Book> list);
}