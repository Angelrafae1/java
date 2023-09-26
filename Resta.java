/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author 222967355
 */
public class Resta extends Operacion{
    
    public Resta(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    //sobrecarga de resta
    public void opr(){
    resultado=num1-num2;
        System.out.println(resultado);
    }
    
}
