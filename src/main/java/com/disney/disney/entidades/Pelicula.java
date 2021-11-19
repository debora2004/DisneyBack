/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.disney.disney.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


@Data

@Table(name = "pelicula")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Pelicula {
 @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer pelicula_id;
    private String titulo;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fecha_estreno;
    
    private Integer puntuacion;
    
    @OneToOne
    private Img imagen;
    
    @OneToOne
    private Genero genero;
}
