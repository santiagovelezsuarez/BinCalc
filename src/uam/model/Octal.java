package uam.model;

/**
 *
 * @author santi
 */
public class Octal extends Numero implements Convertible
{    
    public Octal(String num)
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
        Octal n2 = new Octal(num.getNum());       
        return this.toBinary().sum(n2.toBinary());         
    }
    
    @Override
    public String toString() 
    {
        return "Octal: "+this.num;
    }
}
