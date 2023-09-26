/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 222967355
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,desicion=0, v1 = 0,v2=0;
        boolean salir=false;
        Scanner dato=new Scanner(System.in);
         System.out.println("Hola bienvenido a la calculardora/n¿que deseas hacer?");
         do{
             while(!salir){try{
            System.out.println("ingresa el primer numero/n");
            n1=dato.nextInt();
            v1=n1;
            dato.nextLine();
            salir=true;
                 }
        catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un valor válido.");
            dato.nextLine(); // Limpia el buffer del Enter
                }
        }
        salir=false;
        while(!salir){
            try{
            System.out.println("ingresa el segundo numero/n");
            n2=dato.nextInt();
            v2=n2;
            dato.nextLine();
            salir=true;
                 }
                    catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa un valor válido.");
                    dato.nextLine(); // Limpia el buffer del Enter
                }
        }
          salir=false;
             while(!salir){
                 try{
                         System.out.println("1-Suma/n2-resta/n3-multiplicacion/n4-division/n5-salir");    
                         desicion=dato.nextInt();
                         dato.nextLine();
                         salir=true;
                 }
                    catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa un valor válido.");
                    dato.nextLine(); // Limpia el buffer del Enter
                }
             }
           salir=false;
        
        Suma sum=new Suma(v1,v2);
        Resta res= new Resta(v1,v2);
        Multiplicacion mul=new Multiplicacion(v1,v2);
        Division div=new Division(v1,v2);
        switch(desicion){
            case 1:
                sum.opr();
                
       break;
            case 2:
                res.opr();
                break;
            case 3:
                mul.opr();
                break;
            case 4:
                div.opr();
                break;
            case 5:
                System.out.println("gracias por usar el programa");
                break;
            default:
                break;
        }

         }while(desicion!=5);

    }
    
}
