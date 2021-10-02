package uam.model;

/**
 *
 * @author santi
 */
public class CA2 extends Binario 
{    
    public CA2(String num)
    {
        super(num);
    }    

    @Override
    public Binario toBinary() 
    {
        return super.toCA2();
    }

    @Override
    public Hexadecimal toHexadecimal() 
    {
        return this.toBinary().toHexadecimal();
    }

    @Override
    public Octal toOctal() 
    {
        return this.toBinary().toOctal();
    }

    @Override
    public Decimal toDecimal() 
    {
        return this.toBinary().toDecimal();
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
    public String getNum()
    {
        return this.num;
    }    
}
