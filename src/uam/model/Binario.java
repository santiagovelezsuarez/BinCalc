package uam.model;

import java.util.regex.Pattern;

/**
 *
 * @author santi
 */
public class Binario implements Convertible
{
    private final String num;
    
    public Binario(String num)
    {
        this.num = num;
    }

    @Override
    public Binario toBinary() 
    {
        return this;
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
        Decimal decimal = toDecimal();       
        return decimal.toOctal();
    }

    @Override
    public Decimal toDecimal() 
    {
        int dec = 0;
        int bits = getLastPos();
        int exp = 0;
        for(int i=bits; i>=0; i--)
        {
            dec+=getBitAt(i)?(Math.pow(2, exp)):0;
            exp++;
        }
        return new Decimal(dec);
    }    
    
    public Binario sum(Binario bin)
    {
        String result = "";
        int longest = this.num.length() > bin.getNum().length()?this.num.length():bin.getNum().length();
        boolean carry = false;
        for(int i=0; i<longest; i++)
        {
            char bit = sumBit(this.getLastBitAt(i), bin.getLastBitAt(i), carry)?'1':'0';
            carry = (bin.getLastBitAt(i)&carry) | (this.getLastBitAt(i)&carry) | (this.getLastBitAt(i)&bin.getLastBitAt(i));
            result = bit + result;
        }        
        return new Binario(result);
        
    }   
    
    private boolean sumBit(boolean b1, boolean b2, boolean carry)
    {
        return b1 ^ b2 ^ carry;
    }
    
    private boolean getLastBitAt(int pos)
    {
        int last = this.num.length()-1;
        int i = last - pos;
        return i>=0?this.num.charAt(i)=='1':false;
    }
    
    
    private boolean getBitAt(int pos)
    {
        return this.num.charAt(pos)=='1';
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
