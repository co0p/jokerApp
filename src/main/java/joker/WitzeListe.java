package joker;

import java.util.*;

public class WitzeListe {

    private List<Witz> liste;

    public WitzeListe() {
        this.liste = new ArrayList<Witz>();
    }

    public void add(Witz witz) {
        this.liste.add(witz);
    }

    public Witz getWitz() {

        int randomIndex = 0; // I used a dice
        return liste.get(0);
    }

}