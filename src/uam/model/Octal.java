/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.model;

/**
 *
 * @author santi
 */
public class Octal implements Convertible
{
    private final String num;
    
    public Octal(String num)
    {
        this.num = num;
    }

    @Override
    public Binario toBinary()
    {
        Decimal decimal = toDecimal();
        return decimal.toBinary();
    }

    @Override
    public Hexadecimal toHexadecimal() 
    {
        Decimal decimal = toDecimal();
        return decimal.toHexadecimal();
    }

    @Override
    public Octal toOctal() 
    {
        return this;
    }

    @Override
    public Decimal toDecimal() 
    {        
        int dec = 0;
        int bits = getLastPos();
        int exp = 0;
        for(int i=bits; i>=0; i--)
        {
            int h = Integer.parseInt(this.num.charAt(i)+"");
            dec+= h * Math.pow(8, exp);
            exp++;
        }
        return new Decimal(dec);
    }
    
    private int getLastPos()
    {
        return this.num.length()-1;
    }
    
    public String getNum()
    {
        return this.num;
    }
}
