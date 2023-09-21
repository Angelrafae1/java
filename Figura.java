/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_figura;

/**
 *
 * @author 222967355
 */
public class Figura {
    int lado,numlados;
    String color;
    public Figura(){}
    
    public Figura(int lado, int numlados,String color){
    this.lado=lado;
    this.numlados=numlados;
    this.color=color;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getNumlados() {
        return numlados;
    }

    public void setNumlados(int numlados) {
        this.numlados = numlados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    void area(){}
}

