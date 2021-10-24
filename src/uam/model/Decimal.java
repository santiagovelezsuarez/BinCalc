package uam.model;

import java.util.regex.Pattern;

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
    public Convertible sum(Convertible num) 
    {        
        return this.toBinary().sum(num);        
    }
    
    @Override
    public Convertible mult(Convertible num) 
    {
        return this.toBinary().mult(num);
    }
    
    @Override
    public Convertible div(Convertible n2) 
    {
       return new Decimal(String.valueOf(Integer.parseInt(this.num)/Integer.parseInt(n2.toDecimal().num)));       
    }
    
    @Override
    public String toString() 
    {
        return "Decimal: "+this.num;
    }
    
    @Override
    public boolean validateRegex() 
    {
        System.out.println("exp: "+num);
        System.out.println("match: "+Pattern.matches("([0-9]+)", num));
        return Pattern.matches("([0-9]+)", num);
    }  
    
}
