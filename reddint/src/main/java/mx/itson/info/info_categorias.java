/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.info;

import mx.itson.entidad.categorias;
import mx.itson.entidad.categorias;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class info_categorias {
     public static void main(String[] args) {
    categorias cate1= new categorias();
    cate1.setAtep("1");
    cate1.setName("Politica");
    
     categorias cate2= new categorias();
    cate1.setAtep("2");
    cate1.setName("MEMES");
    
     categorias cate3= new categorias();
    cate1.setAtep("3");
    cate1.setName("VideoJuegos");
   
      List<categorias> cates = new ArrayList<>();  
      cates.add(cate1);
      cates.add(cate2);
      cates.add(cate3);
      
}}
