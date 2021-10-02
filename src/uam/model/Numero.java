package uam.model;

/**
 *
 * @author santi
 */
public abstract class Numero 
{
    protected final String num;
    
    public Numero(String num)
    {
        this.num = num;
    }   
    
    public abstract Numero sum(Numero num);
    
    public String getNum()
    {
        return this.num;
    }
    
    protected boolean getLastBitAt(int pos)
    {
        int last = this.num.length()-1;
        int i = last - pos;
        return i>=0?this.num.charAt(i)=='1':false;
    }    
    
    protected boolean getBitAt(int pos)
    {
        return this.num.charAt(pos)=='1';
    }
    
    protected int getLastPos()
    {
        return this.num.length()-1;
    }
}
