/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variante1;

/**
 *
 * @author Juan Esteban
 */
public class pruebaPersonaje {
    public static void main(String[]args){
        Personaje juancho=new Personaje("Juancho",'M');
        juancho.muestra();
        juancho.moverArriba(25);
        juancho.recogerBotiquin();
        juancho.moverAbajo(62);
        System.out.println();
        juancho.muestra();
    }
    
}
