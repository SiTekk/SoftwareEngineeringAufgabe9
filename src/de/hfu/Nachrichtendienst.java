package de.hfu;

import java.util.*;

public class Nachrichtendienst {

    private List<Empfaenger> angemeldeteEmpfaenger = new ArrayList<>();

    /**
     * @param nachricht
     * @param benutzername
     */
    public void send(Nachricht nachricht, String benutzername) {
        for (Empfaenger e : angemeldeteEmpfaenger) {
            if (e.getBenutzername().equals(benutzername)) {
                e.empfangen(nachricht);
                return;
            }
        }
        System.out.println("Kein Empfänger mit Benutzername: " + benutzername + " angemeldet!");

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