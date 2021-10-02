package uam;

import java.util.regex.Pattern;
import uam.calc.Calculadora;
import uam.calc.gui.Vista;
import uam.model.Binario;
import uam.model.Decimal;
import uam.model.Hexadecimal;
import uam.model.Octal;

/**
 *
 * @author santi
 */
public class Main 
{
    public static void main(String[] args)
    {        
        Calculadora calc = new Calculadora();
        /*Decimal decimal = new Decimal("15");        
        System.out.println("Decimal: "+calc.toDecimal(decimal).getNum());
        System.out.println("Binario: "+calc.toBinary(decimal).getNum());
        System.out.println("Hexadecimal: "+calc.toHexadecimal(decimal).getNum());
        System.out.println("Octal: "+calc.toOctal(decimal).getNum());
        System.out.println("CA1: "+calc.toCA1(decimal).getNum());
        System.out.println("CA2: "+calc.toCA2(decimal).getNum());
        System.out.println("Gray: "+calc.toGray(decimal).getNum());  
        System.out.println("Suma: "+calc.sum(decimal, decimal).getNum());
        
        System.out.println("");
        
        Binario binario = new Binario("1010");        
        System.out.println("Decimal: "+calc.toDecimal(binario).getNum());        
        System.out.println("Binario: "+calc.toBinary(binario).getNum());
        System.out.println("Hexadecimal: "+calc.toHexadecimal(binario).getNum());
        System.out.println("Octal: "+calc.toOctal(binario).getNum());
        System.out.println("CA1: "+calc.toCA1(binario).getNum());
        System.out.println("CA2: "+calc.toCA2(binario).getNum());
        System.out.println("Gray: "+calc.toGray(binario).getNum());  
        System.out.println("Suma: "+calc.sum(binario, binario).getNum());
        
        System.out.println("");
        
        Hexadecimal hexadecimal = new Hexadecimal("FFF");        
        System.out.println("Decimal: "+calc.toDecimal(hexadecimal).getNum());        
        System.out.println("Binario: "+calc.toBinary(hexadecimal).getNum());
        System.out.println("Hexadecimal: "+calc.toHexadecimal(hexadecimal).getNum());
        System.out.println("Octal: "+calc.toOctal(hexadecimal).getNum());
        System.out.println("CA1: "+calc.toCA1(hexadecimal).getNum());
        System.out.println("CA2: "+calc.toCA2(hexadecimal).getNum());
        System.out.println("Gray: "+calc.toGray(hexadecimal).getNum());  
        System.out.println("Suma: "+calc.sum(hexadecimal, hexadecimal).getNum());
        
         System.out.println("");
        
        Octal octal = new Octal("1570");        
        System.out.println("Decimal: "+calc.toDecimal(octal).getNum());        
        System.out.println("Binario: "+calc.toBinary(octal).getNum());
        System.out.println("Hexadecimal: "+calc.toHexadecimal(octal).getNum());
        System.out.println("Octal: "+calc.toOctal(octal).getNum());
        System.out.println("CA1: "+calc.toCA1(octal).getNum());
        System.out.println("CA2: "+calc.toCA2(octal).getNum());
        System.out.println("Gray: "+calc.toGray(octal).getNum());  
        System.out.println("Suma: "+calc.sum(octal, octal).getNum());*/
        
        
        Vista vista = new Vista(calc);
        vista.setVisible(true);  
        //boolean matches = Pattern.matches("([01]+)(((\\+?)([01]+)+)*)", "111");
        //System.out.println(matches);
        //vista.dispose();
    }
}
