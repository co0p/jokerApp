package joker;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class WitzeListeTest {

  @Test
  public void WitzeListeReturnsWitz() {
    Witz witz = new Witz("demo");
    WitzeListe liste = new WitzeListe(Arrays.asList(witz));
    assertEquals(liste.getWitz(), witz);
  }  
}