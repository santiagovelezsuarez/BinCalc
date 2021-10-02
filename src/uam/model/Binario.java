package uam.model;
/**
 *
 * @author santi
 */
public class Binario extends Numero implements Convertible
{    
    public Binario(String num)
    {
        super(num);
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
        return new Decimal(String.valueOf(dec));
    }    
    
    @Override
    public Numero sum(Numero bin)
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
        if(carry)
            result = '1'+result;
        
        return new Binario(result);
        
    }   
    
    protected boolean sumBit(boolean b1, boolean b2, boolean carry)
    {
        return b1 ^ b2 ^ carry;
    }
    
    protected boolean sumBit(boolean b1, boolean b2)
    {
        return b1 ^ b2;
    }      

    @Override
    public CA1 toCA1() 
    {
        String result =  "";      
        for(int i=0; i<this.num.length(); i++)
        {
            char bit = !getBitAt(i)?'1':'0';
            result+=bit;
        }        
        return new CA1(result);
    }

    @Override
    public CA2 toCA2() 
    {  
       CA1 toCA1 = this.toCA1();       
       Numero sum = toCA1.sum(new Binario("1"));    
       return new CA2(sum.getNum());
    }

    @Override
    public Gray toGray() 
    {
        char msb = getBitAt(0)?'1':'0';
        String result =  ""+msb;      
        for(int i=0; i<this.num.length()-1; i++)
        {
            char bit = sumBit(getBitAt(i), getBitAt(i+1))?'1':'0';
            result+=bit;
        }        
        return new Gray(result);
    }  

    @Override
    public String toString() 
    {
        return "Binario: "+this.num;
    }    
    
}
