/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.disney.disney.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Usuario {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer usuario_id;
    private String nombre;
    private String email;
    
    private String username;
    private String contraseña;
}
