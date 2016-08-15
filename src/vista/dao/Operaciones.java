/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.dao;

import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial7
 */
public class Operaciones
{
private double n1; 
private double n2;    

    public Operaciones(double n1, double n2) 
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double suma() {
    return n1+n2;}
    
    
    public double resta() {
    return n1-n2;}
    
    
     public double multiplica () {
    return n1*n2;}

     
     public double divide() {
         
    double nn=0;
       try 
       {
           nn=n1/n2;
       } catch (Exception e)
       {
           JOptionPane.showMessageDialog(null,"Ingresa un valor válido");
       }
       return nn;
     }
      
      
}
