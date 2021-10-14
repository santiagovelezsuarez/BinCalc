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
public interface Convertible 
{
    Binario toBinary();
    Hexadecimal toHexadecimal();
    Octal toOctal();
    Decimal toDecimal();
    CA1 toCA1();
    CA2 toCA2();
    Gray toGray();
    Convertible sum(Convertible n2);
    String getNum();
    boolean validateRegex();
}
