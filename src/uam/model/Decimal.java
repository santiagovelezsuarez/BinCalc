/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.model;

/**
 *
 * @author santi
 */
public class Decimal implements Convertible
{
    private final int num;
    
    public Decimal(int num)
    {
        this.num = num;
    }
    
    @Override
    public Binario toBinary()
    {
      String bin = "";
      int idiv = this.num;
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
        int idiv = this.num;
        while(idiv>=Hexadecimal.HEX.length)
        {
            char h = Hexadecimal.HEX[idiv%15];
            idiv/=16;
            hex = h + hex;
        }
        hex = Hexadecimal.HEX[idiv%15]+ hex;
        return new Hexadecimal(hex);        
    }

    @Override
    public Octal toOctal() 
    {
        String oct = "";
        int idiv = this.num;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getNum()
    {
        return this.num;
    }
    
}
