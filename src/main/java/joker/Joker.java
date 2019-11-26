package joker;

import joker.ConsoleAusgabe;
import joker.WitzeListe;

public class Joker {

    private WitzeListe liste;
    private ConsoleAusgabe consoleAusgabe;

    public Joker(WitzeListe liste, ConsoleAusgabe ausgabe) {
        this.liste = liste;
        this.consoleAusgabe = ausgabe;
    }

    public void tellJoke() {
        Witz derWitz = this.liste.getWitz();
        this.consoleAusgabe.ausgeben(derWitz);
    } 
}