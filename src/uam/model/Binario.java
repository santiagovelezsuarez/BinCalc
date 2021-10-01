package uam.model;

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
