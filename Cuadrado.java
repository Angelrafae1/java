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
public class Cuadrado extends Figura {
    public Cuadrado(){}
    public Cuadrado(int lado, int numlados,String color){
    super(lado, numlados, color);
    }
    void area(){
    JOptionPane.showMessageDialog(null, "calculo el area del cuadrado");
    lado=Integer.parseInt(JOptionPane.showInputDialog("introduce el lado del cuadrado"));
    JOptionPane.showMessageDialog(null, "el resultado del area es: "+lado*lado);
    }
    void perimetro(){
    JOptionPane.showMessageDialog(null, "calculo el perimetro del cuadrado");
    JOptionPane.showMessageDialog(null, "el resultado del perimetro es: "+lado*4);
    }
}
