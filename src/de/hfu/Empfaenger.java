package de.hfu;

import java.util.*;

public class Empfaenger {

    private List<Nachricht> empfangeneNachrichten;
    private String benutzername;

    public Empfaenger(String benutzername)
    {
        empfangeneNachrichten = new ArrayList<>();
        this.benutzername = benutzername;
    }

    /**
     *
     * @param nachricht
     */
    public void empfangen(Nachricht nachricht) {
        // TODO - implement Empfaenger.empfangen
        throw new UnsupportedOperationException();
    }

}