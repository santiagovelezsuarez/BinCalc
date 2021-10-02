package uam.model;

/**
 *
 * @author santi
 */
public class Decimal extends Numero implements Convertible
{    
    public Decimal(String num)
    {
        super(num);
    }
    
    @Override
    public Binario toBinary()
    {
      String bin = "";
      int idiv = Integer.parseInt(this.num);
      while(idiv>0)
      {
          boolean mod = idiv % 2 == 1;
          idiv/=2;
          char bit = mod?'1':'0';
          bin = bit + bin;          
      }        
      return new Binario(bin);
    }

    @Override
    public Hexadecimal toHexadecimal() 
    {
        String hex = "";
        int idiv = Integer.parseInt(this.num);
        while(idiv>=Hexadecimal.HEX.length)
        {
            char h = Hexadecimal.HEX[idiv%16];
            idiv/=16;
            hex = h + hex;
        }
        hex = Hexadecimal.HEX[idiv%16]+ hex;
        return new Hexadecimal(hex);        
    }

    @Override
    public Octal toOctal() 
    {
        String oct = "";
        int idiv = Integer.parseInt(this.num);
        while(idiv>8)
        {
            int o = idiv % 8;
            idiv/=8;
            oct = (o)+oct;
        }
        oct = (idiv)+oct;
        return new Octal(oct);
    }

    @Override
    public Decimal toDecimal() 
    {
        return this;
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
        Decimal n2 = new Decimal(num.getNum());       
        return this.toBinary().sum(n2.toBinary());        
    }
    
    @Override
    public String toString() 
    {
        return "Decimal: "+this.num;
    }
    
}
