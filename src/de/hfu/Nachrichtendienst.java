package de.hfu;

import java.util.*;

public class Nachrichtendienst {

    private List<Empfaenger> angemeldeteEmpfaenger = new ArrayList<>();

    /**
     * @param nachricht
     * @param benutzername
     */
    public void send(Nachricht nachricht, String benutzername) {
        // TODO - implement Nachrichtendienst.send
        throw new UnsupportedOperationException();

    }

    /**
     * @param nachricht
     */
    public void send(Nachricht nachricht) {
        for (Empfaenger empfaenger : angemeldeteEmpfaenger) {
            empfaenger.empfangen(nachricht);
        }
    }

    /**
     * @param empfaenger
     */
    public void anmelden(Empfaenger empfaenger) {
        angemeldeteEmpfaenger.add(empfaenger);
    }

    /**
     * @param empfaenger
     */
    public void abmelden(Empfaenger empfaenger) {
        angemeldeteEmpfaenger.remove(empfaenger);
    }

}