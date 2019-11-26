package joker;

import org.junit.Test;
import static org.junit.Assert.*;

public class WitzeListeTest {

  @Test
  public void WitzeListeReturnsWitz() {

    Witz witz = new Witz("demo");

    WitzeListe liste = new WitzeListe();
    liste.add(witz);

    assertEquals(liste.getWitz(), witz);
  }  

}