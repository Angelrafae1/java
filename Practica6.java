/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 222967355
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///arraylist de diferentes tipos de dato
        //ejemplo con un arreglo que almacena cualquier tipo de dato
       /* ArrayList ejemplo1=new ArrayList();
        ejemplo1.add("nombre: angel");
        ejemplo1.add(2);
        ejemplo1.add('a');
        ejemplo1.add(25.12);
        for (int i = 0; i <ejemplo1.size(); i++) {
            System.out.println("posicion "+(i+1)+" "+ejemplo1.get(i));
        }*/
        
        //ejemplo que almacena solo un tipo de dato
        /*
        ArrayList <String> ejemplo2=new ArrayList();
        ejemplo2.add("juan");
        ejemplo2.add("jose");
        ejemplo2.add("mateo");
        System.out.println(ejemplo2);
        */
        //arraylist bidimensional
        //sintaxis
        
        ArrayList <ArrayList<String>> ejemplo3=new ArrayList();
        //dentro de la primera linea se grega un arreglo
        ejemplo3.add(new ArrayList<String>());
        //en la posicion cero del arreglo se agrega el dato
        ejemplo3.get(0).add("angel");
        //si se realiza 
        ejemplo3.get(0).add("rafael");
        //luego se genera otro arreglo
        ejemplo3.add(new ArrayList<String>());
        ejemplo3.get(1).add("adrian");
        ejemplo3.get(1).add("gris");
        System.out.println(ejemplo3);
        for (int i = 0; i <ejemplo3.get(0).size(); i++) {
              System.out.println(ejemplo3.get(0).get(i));
                 System.out.println(ejemplo3.get(1).get(i));
        }
    }
    
}
