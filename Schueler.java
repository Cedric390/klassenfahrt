import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * Beschreiben Sie hier die Klasse Schueler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schueler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String vorname;
    private String name;
    private Fahrt fahrt;
    private Hotel hotel;

    private JFrame fenster;
    
    /**
     * Konstruktor für Objekte der Klasse Schueler
     */
    public Schueler(String vorname, String name, Fahrt fahrt, Hotel hotel)
    {
        this.vorname = vorname;
        this.name = name;
        this.fahrt = fahrt;
        this.hotel = hotel;
        
        fensterErzeugen();
    }
    
    public void fensterErzeugen()
    {
        fenster = new JFrame("Klassenfahrt");
        JLabel gesamtpreis = new JLabel();
        
        fenster.setLayout(new GridLayout(0, 1));
        fenster.add(new JLabel(name + ", " + vorname));
        
        JPanel fahrtPanel = new JPanel(new FlowLayout());
        fahrtPanel.add(new JLabel("Fahrtpreis:"));
        JTextField fahrtpreis = new JTextField(Integer.toString(fahrt.gibPreis()));
        fahrtpreis.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                fahrt.setzePreis(Integer.parseInt(fahrtpreis.getText()));
                gesamtpreis.setText(Integer.toString(fahrt.gibPreis() + hotel.gibGesamtpreis()));
            }
        });
        fahrtPanel.add(fahrtpreis);
        fahrtPanel.add(new JLabel("Euro"));
        fenster.add(fahrtPanel);
        
        JPanel hotelPanel = new JPanel(new FlowLayout());
        hotelPanel.add(new JLabel("Hotelpreis:"));
        JLabel tage = new JLabel(Integer.toString(hotel.gibAnzahl()));
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                hotel.setzeAnzahl(hotel.gibAnzahl()-1);
                tage.setText(Integer.toString(hotel.gibAnzahl()));
                gesamtpreis.setText(Integer.toString(fahrt.gibPreis() + hotel.gibGesamtpreis()));
            }
        });
        hotelPanel.add(minus);
        
        hotelPanel.add(tage);
        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                hotel.setzeAnzahl(hotel.gibAnzahl()+1);
                tage.setText(Integer.toString(hotel.gibAnzahl()));
                gesamtpreis.setText(Integer.toString(fahrt.gibPreis() + hotel.gibGesamtpreis()));
            }
        });
        hotelPanel.add(plus);
        JTextField hotelpreis = new JTextField(Integer.toString(hotel.gibPreis()));
        hotelpreis.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                hotel.setzePreis(Integer.parseInt(hotelpreis.getText()));
                gesamtpreis.setText(Integer.toString(fahrt.gibPreis() + hotel.gibGesamtpreis()));
            }
        });
        hotelPanel.add(hotelpreis);
        hotelPanel.add(new JLabel("Euro"));
               
        fenster.add(hotelPanel);
        
        JPanel gesamtPanel = new JPanel(new FlowLayout());
        gesamtPanel.add(new JLabel("Gesamtpreis:"));
        gesamtpreis.setText(Integer.toString(fahrt.gibPreis() + hotel.gibGesamtpreis()));
        gesamtPanel.add(new JLabel("Euro"));
        gesamtPanel.add(gesamtpreis);
        fenster.add(gesamtPanel);
        
        fenster.pack();
        fenster.setVisible(true);
    }

}
