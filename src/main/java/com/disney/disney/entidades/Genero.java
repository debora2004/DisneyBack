/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.disney.disney.entidades;

import javax.persistence.*;
import lombok.Data;

@Data

@Table(name = "genero")
@Entity
public class Genero {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer genero_id;
    private String nombre;
    
   @OneToOne
    private Img imagen;
}
