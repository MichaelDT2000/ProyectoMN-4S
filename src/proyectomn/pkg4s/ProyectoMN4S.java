/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomn.pkg4s;

import controladores.metodoBiseccion;

/**
 *
 * @author mayko
 */
public class ProyectoMN4S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double respuesta;
        metodoBiseccion met=new metodoBiseccion();
        
        respuesta=met.biseccion(0, 1, 0, "x^2+x-1");
        System.out.print("La raiz es: "+respuesta+"\n" + "resultado \n"+"Michael");
    }
    
}
