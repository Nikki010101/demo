/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author nikhi
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
//@Table(name="ItemTable")
@Data
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long itemId;
   @Column
    private String itemName;
    @Column
    private String itemDesc;
   



}
