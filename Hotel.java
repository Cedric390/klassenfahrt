
/**
 * Beschreiben Sie hier die Klasse Hotel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hotel
{
    private int anzahl;
    private int preis;

    /**
     * Konstruktor für Objekte der Klasse Hotel
     */
    public Hotel(int anzahl, int preis)
    {
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public int gibAnzahl()
    {
        return anzahl;
    }
    
    public void setzeAnzahl(int anzahl)
    {
        this.anzahl = anzahl;
    }
    
    public int gibPreis()
    {
        return preis;
    }
    
    public void setzePreis(int preis)
    {
        this.preis = preis;
    }
    
    public int gibGesamtpreis()
    {
        return anzahl * preis;
    }
}
