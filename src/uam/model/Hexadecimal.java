package uam.model;

/**
 *
 * @author santi
 */
public class Hexadecimal extends Numero implements Convertible
{    
    public static final char[] HEX = {'0','1','2','3','4','5','6','7','8','9', 'A', 'B', 'C', 'D', 'E', 'F'};
    
    public Hexadecimal(String num)
    {
        super(num);
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
        return new Decimal(String.valueOf(dec));
    }  

    @Override
    public CA1 toCA1()
    {
        return this.toBinary().toCA1();
    }

    @Override
    public CA2 toCA2() 
    {
        return this.toBinary().toCA2();
    }

    @Override
    public Gray toGray() 
    {
        return this.toBinary().toGray();
    }

    @Override
    public Numero sum(Numero num) 
    {
        Hexadecimal n2 = new Hexadecimal(num.getNum());       
        return this.toBinary().sum(n2.toBinary());        
    }

    @Override
    public String toString() 
    {
        return "Hexadecimal: "+getNum();
    }
    
}
