package joker;

import org.junit.Test;

import joker.ConsoleAusgabe;

import static org.junit.Assert.*;

import java.util.Arrays;

public class JokerTest {

    @Test
    public void JokerShouldTellJoke() {
        ConsoleAusgabe ausgabe = new ConsoleAusgabe();
        WitzeListe liste = new WitzeListe(Arrays.asList(new Witz("demo")));

        Joker jokeTeller = new Joker(liste, ausgabe);
        jokeTeller.tellJoke();
    }

}