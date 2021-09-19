/**
 * Eine Klasse für Autos
 *
 * @author Christoph Lottersberger
 * @version 1.0.0
 * @since 17.08.2021
 */

//einzeiliger Kommentar

/**
 * mehrzeiliger
 * Kommentar
 */



//Strg + y - Zeile löschen
//Strg + d - Zeile kopieren
//Strg + w - mehrere Zeilen auswählen
//Strg + Umschalt + w - weniger Zeilen auswählen
//Strg + Alt + Umschalt + U - UML
//Strg + / - Kommentar aktivieren
//Strg + / - Kommentar deaktivieren
//Strg + Umschalt + / - Mehrzeiliger Kommentar aktivieren
//Strg + Umschalt + / - Mehrzeiliger Kommentar deaktivieren
//Alt + Einfg - Generate
// /** - JavaDoc vor Methode/Konstruktor
//Strg + Umschalt + A - Zeige alle Befehle

//Refactoring
//Umschalt + F6 - Umbenennen
//F5 - Klasse kopieren
//F6 - Move member


//Formatierung
//    Strg + Alt + L - Formatierung

//    Inspektionen
// Alt + Enter - Inspektion
//Strg + Leertaste - Vervollständigung Code

//Klasse

public class Auto {

    //Eigenschaften/Datenfelder
    private int preis;
    private int reifen;
    private int tueren;
    private int ps;

    //Konstruktoren

    /**
     * @param preis  - der Preis
     * @param reifen - die Reifen
     * @param tueren - die Türenanzahl
     * @param ps     - die Pferdestärke
     */
    public Auto(int preis, int reifen, int tueren, int ps) {
        this.preis = preis;
        this.reifen = reifen;
        this.tueren = tueren;
        this.ps = ps;
    }

    //Methoden

    /**
     * @return - Gibt den Preis zurück
     */
    public int getPreis() {
        return preis;
    }

    /**
     * @param preis - Setzt den Preis
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

    /**
     * @return - Gibt die Reifenanzahl zurück
     */
    public int getReifen() {
        return reifen;
    }

    /**
     * @param reifen - Setzt die Reifenanzahl
     */
    public void setReifen(int reifen) {
        this.reifen = reifen;
    }

    /**
     * @return - Gibt die Türenanzahl zurück
     */
    public int getTueren() {
        return tueren;
    }

    /**
     * @param tueren - Setzt die Türenanzahl
     */
    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    /**
     * @return - Gibt die Pferdestärke zurück
     */
    public int getPs() {
        return ps;
    }

    /**
     * @param ps - Setzt die Pferdestärke
     */
    public void setPs(int ps) {
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "preis=" + preis +
                ", reifen=" + reifen +
                ", tueren=" + tueren +
                ", ps=" + ps +
                '}';
    }
}
