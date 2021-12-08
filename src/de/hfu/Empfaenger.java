package de.hfu;

import java.util.*;

public class Empfaenger {

    private List<Nachricht> empfangeneNachrichten;
    private String benutzername;

    public Empfaenger(String benutzername) {
        empfangeneNachrichten = new ArrayList<>();
        this.benutzername = benutzername;
    }

    /**
     * @param nachricht zu empfangene Nachricht
     */
    public void empfangen(Nachricht nachricht) {
        empfangeneNachrichten.add(nachricht);
    }

    public String getBenutzername() {
        return benutzername;
    }
}