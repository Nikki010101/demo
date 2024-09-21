/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Item;
import com.example.demo.repository.ItemRepository;
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
    public Item getItemByItemId(Long id){
        Optional<Item> i=itemRepository.findById(id);
        return i.orElseThrow(()->new RuntimeException("not found"));
    }
    public Item updateItem(Item i){
        if(itemRepository.existsById(i.getItemId()))
        {
            return itemRepository.save(i);
        }
        else throw new RuntimeException("Not Found");
    }
    
    public void deleteById(Long id){
       if(itemRepository.existsById(id)){
        itemRepository.deleteById(id);}
        else throw new RuntimeException("Not Found");
        
       }
       public List<Item> getItemByItemName(String itemName){
        if(!itemRepository.findAll().isEmpty()){
        return itemRepository.findAll().stream().filter(i -> i.getItemName().equalsIgnoreCase(itemName)).
        collect(Collectors.toList());
    }else throw new RuntimeException("No items exists");
        
       }
         

    }

