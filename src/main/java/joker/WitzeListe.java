package joker;

import java.util.*;

public class WitzeListe {

    private List<Witz> liste;

    public WitzeListe(List<Witz> witze) {
        this.liste = new ArrayList<Witz>();
        this.liste.addAll(witze);
    }

    public Witz getWitz() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(liste.size());
        return liste.get(randomIndex);
    }

}