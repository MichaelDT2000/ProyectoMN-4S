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
public class metodoBiseccion {
    
    double  x;
    double contador;
    JEP j;

    public metodoBiseccion() {
    }
    
    
    public double biseccion(double xa, double xb ,double Errpor, String funcion)
    {
        this.x= Double.NaN;
        this.contador=0;
        double evalXa, evalXb, errorA, xAnterior=0;
        
        evalXa=evaluar(funcion, xa);
        if(!Double.isNaN(evalXa))
        {
            evalXb=evaluar(funcion, xb);
            if(evalXa*evalXb<0)
            {
                do{
                    this.x=(xa+xb)/2;
                    errorA=Math.abs((this.x-xAnterior)/this.x)*100;
                    xAnterior=this.x;
                    evalXa=evaluar(funcion, xa);
                    evalXb=evaluar(funcion, xb);
                    
                    if(evalXa*evaluar(funcion, x)<0)
                    {
                        xb=this.x;
                    }else
                    {
                        xa=this.x;
                    }
                    this.contador++;
                }while(Errpor<errorA );
            }
            System.out.println("---------------"+contador);
            if(!Double.isNaN(this.x))
            {
                return this.x;
            }
        }
        return Double.NaN;
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
}
