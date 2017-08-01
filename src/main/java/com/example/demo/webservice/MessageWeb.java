/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.webservice;

import com.example.demo.MessageHeader;
import com.example.demo.jpa.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author waffaa
 */
@RestController
public class MessageWeb {
    @Autowired
    MessageService service;
  @RequestMapping(method = RequestMethod.GET,value={"/message"})
	public List<MessageHeader> findAll() {
		return service.getall();
	}  
}
