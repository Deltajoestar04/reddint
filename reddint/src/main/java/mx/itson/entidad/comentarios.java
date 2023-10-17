/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entidad;

import mx.itson.entidad.User;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class comentarios {

    private User user = new User();
    private String nameencom = new String();
    private Date fecha = new Date();
    private int positivecom = 0;
    private int negativecom = 0;

    public comentarios() {
    
}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPositivecom() {
        return positivecom;
    }

    public void setPositivecom(int positivecom) {
        this.positivecom = positivecom;
    }

    public int getNegativecom() {
        return negativecom;
    }

    public void setNegativecom(int negativecom) {
        this.negativecom = negativecom;
    }

    public String getNameencom() {
        return nameencom;
    }

    public void setNameencom(String nameencom) {
        this.nameencom = nameencom;
    }
}
