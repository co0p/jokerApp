package joker;

import org.junit.Test;

import joker.ConsoleAusgabe;

import static org.junit.Assert.*;

public class JokerTest {

    @Test
    public void JokerShouldTellJoke() {
        ConsoleAusgabe ausgabe = new ConsoleAusgabe();
        Witz einWitz = new Witz("demo");
        WitzeListe liste = new WitzeListe();
        liste.add(einWitz);

        Joker jokeTeller = new Joker(liste, ausgabe);
        jokeTeller.tellJoke();
    }

}