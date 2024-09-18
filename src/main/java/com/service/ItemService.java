/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Item;
import com.repository.ItemRepository;
/**
 *
 * @author nikhi
 */
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item addItem(Item item){
        itemRepository.save(item);
        return item;
    }
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
    public Optional<Item> getItemByItemId(Long id){
        return itemRepository.findById(id);
    }
    public Item updateItem(Item item){
        if(itemRepository.existsById(item.getItemId())){
            return itemRepository.save(item);
        }
        else throw new RuntimeException("Not Found");
    }
    public void deleteById(Long id){
        itemRepository.deleteById(id);
    }
}
