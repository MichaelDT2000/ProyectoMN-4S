/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import org.nfunk.jep.JEP;

/**
 *
 * @author user
 */
public class iteracionSimple_puntoFijo {
    
    JEP j;
    double xAnterior;

    public double PuntoFijo(String funcionX, String funcionG, double x, double errorV)
    {
        int contador=0;
        double errorA;
        System.out.println("*******Raiz en F(x): "+evaluar(funcionX, x));
        do
        {
            xAnterior=x;
            x= evaluar(funcionG, x);
            errorA= Math.abs((x-xAnterior)/x);
            contador++;
            System.out.println("Itaracion"+contador+": "+x);
        }while(errorV<errorA);
        
        return x;
    }
    
    public iteracionSimple_puntoFijo() {
    }
    
    
    public double evaluar(String expresion, double x)
    {
        j= new JEP();
        j.addStandardFunctions();
        j.addStandardConstants();
        j.addVariable("x", x);
        j.parseExpression(expresion);
        if(!j.hasError())
        {
            return j.getValue();
        }else
        {
                return Double.NaN;
        }
    }
    public static double f(double x)
    {
        return ((x*x)-(2 * x )+1);
    }
}
