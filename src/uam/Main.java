package uam;

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
        Binario toBinary = calc.toBinary(new Decimal(10));
        Hexadecimal toHexa = calc.toHexadecimal(new Decimal(10));
        Octal toOct = calc.toOctal(new Decimal(10));
        Decimal toDec = calc.toDecimal(new Binario("1010"));
        Decimal toDec2 = calc.toDecimal(new Hexadecimal("A"));
        Decimal toDec3 = calc.toDecimal(new Octal("12"));
        System.out.println("Bin = "+toBinary.getNum());
        System.out.println("Hex = "+toHexa.getNum());
        System.out.println("Oct = "+toOct.getNum());
        System.out.println("Dec = "+toDec.getNum());
        System.out.println("Dec2 = "+toDec2.getNum());
        System.out.println("Dec3 = "+toDec3.getNum());
        Vista vista = new Vista(calc);
        vista.setVisible(true);         
    }
}