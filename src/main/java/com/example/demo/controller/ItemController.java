/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Item;
import com.example.demo.service.ItemService;




/**
 *
 * @author nikhi
 */
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;
  // @Autowired
  //  private ItemRepository itemRepository;
   
    
    @GetMapping
    public List<Item> getAllItems(){
       return itemService.getAllItems();
    }
    @PostMapping("/add")
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }
    @GetMapping("/getById/{itemId}")
    public Item getItemByItemId(@PathVariable Long itemId) {
        return itemService.getItemByItemId(itemId);
    }
    @PutMapping("/update/{itemId}")
    public Item updateItem(@PathVariable Long itemId, @RequestBody Item item) {
        return itemService.updateItem(item);
    }
    @DeleteMapping("/delete/{itemId}")
    public void deleteItem(@PathVariable Long itemId){
        itemService.deleteById(itemId);
    }
    @GetMapping("/getByName/{itemName}")
    public List<Item> getItemByItemName(@PathVariable String itemName) {
        return itemService.getItemByItemName(itemName);
    }
    

}
