/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.jpa;

import com.example.demo.MessageHeader;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author waffaa
 */
public interface messagerepo extends CrudRepository<MessageHeader, Integer> {
    // T findOne(ID primaryKey);
}
