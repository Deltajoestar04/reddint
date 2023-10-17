/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entidad;


import mx.itson.entidad.comentarios;
import mx.itson.entidad.categorias;
import mx.itson.entidad.User;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class publicacion {
    private categorias caters= new categorias();
    private User user = new User();
    private String descrip = new String();
    private comentarios com = new comentarios();
    private int CantComs = 0;
    private Date fecha = new Date();
    private int positivepost = 0;
    private int negativepost = 0; 
    
    public publicacion (){
    
}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public comentarios getCom() {
        return com;
    }

    public void setCom(comentarios com) {
        this.com = com;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPositivepost() {
        return positivepost;
    }

    public void setPositivepost(int positivepost) {
        this.positivepost = positivepost;
    }

    public int getNegativepost() {
        return negativepost;
    }

    public void setNegativepost(int negativepost) {
        this.negativepost = negativepost;
    }

    public int getCantComs() {
        return CantComs;
    }

    public void setCantComs(int CantComs) {
        this.CantComs = CantComs;
    }

    public categorias getCaters() {
        return caters;
    }

    public void setCaters(categorias caters) {
        this.caters = caters;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
     
}
