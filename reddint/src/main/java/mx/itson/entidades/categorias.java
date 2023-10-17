/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entidades;

/**
 *
 * @author Admin
 */
public class categorias {
    private String name=new String();
    private String Atep=new String();
    private publicacion pub = new publicacion();
     
    public categorias (){
    
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public publicacion getPub() {
        return pub;
    }

    public void setPub(publicacion pub) {
        this.pub = pub;
    }

  

    public String getAtep() {
        return Atep;
    }

    public void setAtep(String Atep) {
        this.Atep = Atep;
    }
}
