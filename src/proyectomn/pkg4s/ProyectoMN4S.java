/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomn.pkg4s;

import controladores.iteracionSimple_puntoFijo;
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
        iteracionSimple_puntoFijo pf=new iteracionSimple_puntoFijo();
        
        respuesta=met.biseccion(1, 3.2, 0.0001, "x^3-7*x^2+14*x-6");
        System.out.println("La raiz es: "+respuesta+"\n" + "resultado \n"+"Michael");
        
        respuesta= pf.PuntoFijo("x^2-2*x+1", "(1+x^2)/2", 0, 0.0072);
        System.out.println("La Raiz es "+respuesta);
    }
    
}
