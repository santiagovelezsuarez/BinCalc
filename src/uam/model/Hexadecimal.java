package uam.model;

/**
 *
 * @author santi
 */
public class Hexadecimal implements Convertible
{
    private final String num;
    
    public static final char[] HEX = {'0','1','2','3','4','5','6','7','8','9', 'A', 'B', 'C', 'D', 'E', 'F'};
    
    public Hexadecimal(String num)
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
        return this;
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
            int h = new String(HEX).indexOf(this.num.charAt(i));            
            dec+= h * Math.pow(16, exp);
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
