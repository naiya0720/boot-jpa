package com.phn.bootjpa.controller;

import com.phn.bootjpa.model.Book;
import com.phn.bootjpa.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import sun.applet.resources.MsgAppletViewer;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author PengHenan
 * @create  2020-03-03 1:03:18
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        mv.addObject("data",bookService.getBookAll());
        mv.addObject("success",true);
        mv.addObject("code",1);
        return mv;
    }

    /**
     * 新增
     * @param book
     * @return
     */
    @RequestMapping("/add")
    public Map<String,Object> addBook(Book book){
        Map<String,Object> map = new HashMap<>();
        Book addData = bookService.addBook(book);
        map.put("新增的数据:", addData);
        map.put("code",1);
        return map;
    }


    /**
     *  查询单个（根据ID查询）
     * @param bid  书本ID
     * @return
     */
    @RequestMapping("/findBy")
    public Map<String,Object> findBy(Integer bid){
        Optional<Book> byId = bookService.findById(bid);
        Map<String,Object> map = new HashMap<>();
        map.put("code",1);
        map.put("data",byId);
        return map;
    }


    /**
     * 根据ID删除书本信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    public Map<String,Object> deleteById(Integer id){
        Map<String,Object> map = new HashMap<>();
        bookService.deletById(id);
        map.put("code",1);
        map.put("seccess","OK");
        return map;
    }




}
