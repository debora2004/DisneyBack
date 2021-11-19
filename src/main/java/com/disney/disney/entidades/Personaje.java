/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.disney.disney.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "personaje")
@Inheritance(strategy = InheritanceType.JOINED)

public class Personaje {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id_personaje;
      
    @OneToOne
    private Img imagen;
    
    @ManyToOne
    private Pelicula pelicula;
  
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;

    
   
    
  
}
