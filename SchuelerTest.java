

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse SchuelerTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SchuelerTest
{
    private Hotel hotel1;
    private Fahrt fahrt1;
    private Schueler schueler1;

    /**
     * Konstruktor fuer die Test-Klasse SchuelerTest
     */
    public SchuelerTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        hotel1 = new Hotel(4, 35);
        fahrt1 = new Fahrt(45);
        schueler1 = new Schueler("Florian", "Neumann", fahrt1, hotel1);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
