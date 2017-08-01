/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.jpa;

import com.example.demo.MessageHeader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author waffaa
 */
@Service
public class MessageService {

    @Autowired
    messagerepo repo;

    //this method return all messages
    public List<MessageHeader> getall() {
        List messages = new ArrayList<>();
        //get all messages from database and add it in array list
        repo.findAll().forEach((e) -> messages.add(e));
        return messages;
    }
}
