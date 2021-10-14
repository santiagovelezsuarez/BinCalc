/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.calc;

import uam.model.Binario;
import uam.model.CA1;
import uam.model.CA2;
import uam.model.Convertible;
import uam.model.Decimal;
import uam.model.Gray;
import uam.model.Hexadecimal;
import uam.model.Numero;
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
    
    public Gray toGray(Convertible num)
    {
        return num.toGray();
    }
    public CA1 toCA1(Convertible num)
    {
        return num.toCA1();
    }
    public CA2 toCA2(Convertible num)
    {
        return num.toCA2();
    }
    
    public Convertible sum(Convertible n1, Convertible n2)
    {
        return n1.sum(n2);
    }
    
    
    
}
