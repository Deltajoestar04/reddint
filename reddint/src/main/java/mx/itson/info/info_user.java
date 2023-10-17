/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.info;

import mx.itson.entidad.User;

/**
 *
 * @author Admin
 */
public class info_user {
    public static void main(String[] args) {
    User user1=new User();
    user1.setName("Jacobo");
    user1.setContraseña("Password");
    user1.setEmail("xd634575@gmail.com");
    user1.setRol("Visitante");
    
    User user2=new User();
    user2.setName("Benito");
    user2.setContraseña("qwert");
    user2.setEmail("bennetsex234@gmail.com");
    user2.setRol("Visitante");
    
    User user3=new User();
    user3.setName("Issac");
    user3.setContraseña("123456789");
    user3.setEmail("Issac123456@gmail.com");
    user3.setRol("Visitante");
    
    User user4=new User();
    user4.setName("Tulio");
    user4.setContraseña("Quiero carne");
    user4.setEmail("Tulio31@gmail.com");
    user4.setRol("Admin");
    
    User user5=new User();
    user5.setName("juan C. Bodoque");
    user5.setContraseña("No soy su amigo");
    user5.setEmail("Bodoque31@gmail.com");
    user5.setRol("Admin");
    
    
    } 
}
