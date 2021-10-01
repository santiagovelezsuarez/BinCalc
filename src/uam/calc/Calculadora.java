/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.calc;

import uam.model.Binario;
import uam.model.Convertible;
import uam.model.Decimal;
import uam.model.Hexadecimal;
import uam.model.Octal;

/**
 *
 * @author santi
 */
public class Calculadora 
{
    public Calculadora()
    {
        
    }
    
    public Binario toBinary(Convertible num)
    {
        return num.toBinary();
    }
    
    public Hexadecimal toHexadecimal(Convertible num)
    {
        return num.toHexadecimal();
    }
    
    public Octal toOctal(Convertible num)
    {
        return num.toOctal();
    }
    
    public Decimal toDecimal(Convertible num)
    {
        return num.toDecimal();
    }
    
    public Binario sum(Binario b1, Binario b2)
    {
        return b1.sum(b2);
    }
    
}
