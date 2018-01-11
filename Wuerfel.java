import java.util.*;
/**
 * @author 
 * @version 
 */
public class Wuerfel
{
    private int zufallszahl;
    private Random zufallsgenerator;
    
    public Wuerfel()
    {
        zufallsgenerator = new Random();
    }
    
    public int wuerfeln()
    {
     return (zufallsgenerator.nextInt(5) + 1 +  zufallsgenerator.nextInt(5) + 1);
    }
}
