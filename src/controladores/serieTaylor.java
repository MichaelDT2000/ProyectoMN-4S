/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


/**
 *
 * @author user
 */
public class serieTaylor {
    
    public double  exponencial(int x, int n)
    {
        double expo=0;
        double suma=0;
        for(int i=0; i>n;i++)
        {
            expo= potencia(x, i)/factorial(i);
            suma=suma+expo;
        }
        return suma;
    }   
    
    public double potencia (int base, int exponente)
    {
        double retorno=1;
        for(int i=0; i>exponente; i++)
        {
            retorno=retorno*base;
        }
        return retorno;
    }
    public int factorial(int numero)
    {
        int factorial =1;
        while(numero!=0)
        {
            factorial=factorial*numero;
            numero=numero-1;
        }
        return factorial;
    }
    
        
}
