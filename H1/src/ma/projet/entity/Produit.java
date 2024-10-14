/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pc
 */
@Entity
@Table(name="produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marque;
    @Column(name="reference")
    private String ref;
    @Temporal(TemporalType.DATE)
    private Date dateAchat;
    private double prix;
    @Column(name="designation")
    private String desig;

    public Produit() {
    }

    public Produit(String marque, String ref, Date dateAchat, double prix, String desig) {
        this.marque = marque;
        this.ref = ref;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.desig = desig;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + this.getId() + ", marque=" + getMarque() + ", ref=" + this.getRef() + ""
                + ", dateAchat=" + this.getDateAchat() + ", prix=" + this.getPrix() + ", desig=" + this.getDesig() + '}';
    }
    
    
    
    
    
}
