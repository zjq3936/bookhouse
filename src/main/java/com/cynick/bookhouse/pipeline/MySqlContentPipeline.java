package com.cynick.bookhouse.pipeline;
/**
 * 章节内容入库
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cynick.bookhouse.entity.Book;
import com.cynick.bookhouse.service.BookService;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
/**
 * 章节内容入库
 * @author CyNick
 * @date 2018年5月4日
 */
@Component("MySqlContentPipeline")
public class MySqlContentPipeline implements Pipeline{
	
	@Autowired
	private BookService bookService;
	
	@Override
	public void process(ResultItems resultItems, Task task) {
		List<Book> list = resultItems.get("obj");
		bookService.saveBooks(list);
	}

}
