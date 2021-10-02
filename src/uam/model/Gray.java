package uam.model;

/**
 *
 * @author santi
 */
public class Gray extends Binario
{    
    public Gray(String num)
    {
        super(num);
    }

    @Override
    public Binario toBinary() 
    {
        char msb = getBitAt(0)?'1':'0';
        String result =  ""+msb; 
        boolean last = msb=='1';
        for(int i=1; i<this.num.length(); i++)
        {
            boolean high = sumBit(last,getBitAt(i));
            char bit = high?'1':'0';
            result+=bit;
            last = high;
        }        
        return new Binario(result);
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

    @Override
    public Numero sum(Numero num) 
    {
        Gray n2 = new Gray(num.getNum());       
        return this.toBinary().sum(n2.toBinary());         
    }
}
