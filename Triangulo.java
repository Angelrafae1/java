/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_figura;

import javax.swing.JOptionPane;

/**
 *
 * @author 222967355
 */
public class Triangulo extends Figura{
    int base,altura;
    public Triangulo(){}
    public Triangulo(int lado,int numlados,String color){
    super(lado,numlados,color); 
    }
    

     void areaT(){
         JOptionPane.showMessageDialog(null, "calculo el area de un triangulo");
      base=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la base: " ));
      altura=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la altura"));
      JOptionPane.showMessageDialog(null,"el area del triangulo es: "+ (base*altura)/2f);
      
     }
     
     void pert(){
     JOptionPane.showMessageDialog(null, "calculo el perimetro de un triangulo");
     lado=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado 1: "));
     lado=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado 2: "))+lado;
     lado=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado 3: "))+lado;
     JOptionPane.showMessageDialog(null, "el perimetro del triangulo es: "+lado);
     }
     }
    /*
    JOptionPane.showMessageDialog(null, "calculo el area del cuadrado");
    lado=Integer.parseInt(JOptionPane.showInputDialog("introduce el lado del cuadrado"));
    JOptionPane.showMessageDialog(null, "el resultado del area es: "+lado*lado);
    }
    void perimetro(){
    JOptionPane.showMessageDialog(null, "calculo el perimetro del cuadrado");
    JOptionPane.showMessageDialog(null, "el resultado del perimetro es: "+lado*4);
    }*
