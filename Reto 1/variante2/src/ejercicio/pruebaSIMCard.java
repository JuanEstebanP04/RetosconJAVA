/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Juan Esteban
 */
public class pruebaSIMCard {
    public static void main(String [] args){
        SIMCard cliente=new SIMCard("3137994573");
        cliente.mostrarAtributos();
        System.out.println();
        cliente.recargarSaldo(50000);
        cliente.comprarDatos(12);
        cliente.mostrarAtributos();
    }
}
