/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h1;

import java.util.Date;
import java.util.List;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ProduitService pp = new ProduitService();
        pp.create(new Produit("Garnier","1123",new Date(),80,"masque"));
        pp.create(new Produit("jaouda","3334",new Date(),4,"lait"));
        pp.create(new Produit("nescafe","4444",new Date(),30,"cafe"));
        pp.create(new Produit("sidiAli","5555",new Date(),7,"eau"));
        pp.create(new Produit("adidas","8965",new Date(),2000,"T-shirt"));
      
       
       for(Produit p:pp.findAll()){
          p.toString();
           System.out.println(p);
            if(p.getPrix()>100){
                     p.toString();
                 }
           }
       if(pp.findById(2)!=null){
           pp.findById(2).toString();
       }
        else{
            System.out.println("produit introuvable");
        }
       
       if(pp.findById(3)!=null){
        pp.delete(pp.findById(3));
       }
       
      
            pp.findById(1).setDateAchat(new Date());
            pp.findById(1).setDesig("Baskets");
            pp.findById(1).setMarque("Nike");
            pp.findById(1).setPrix(3000);
            pp.findById(1).setRef("6767");
             
                 }
    }
     
        
            
            
        
        
        
        // TODO code application logic here
      //  HibernateUtil.getSessionFactory();
    

    

