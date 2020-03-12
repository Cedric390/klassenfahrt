
/**
 * Beschreiben Sie hier die Klasse Fahrt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fahrt
{
    private int preis;

    /**
     * Konstruktor für Objekte der Klasse Fahrt
     */
    public Fahrt(int preis)
    {
        this.preis = preis;
    }

    public int gibPreis()
    {
        return preis;
    }
    
    public void setzePreis(int preis)
    {
        this.preis = preis;
    }
}
