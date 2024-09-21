/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Item;


/**
 *
 * @author nikhi
 */
@Repository
public interface ItemRepository extends JpaRepository<Item,Long>{
   
    public List<Item> findByItemName(String itemDesc);

}
