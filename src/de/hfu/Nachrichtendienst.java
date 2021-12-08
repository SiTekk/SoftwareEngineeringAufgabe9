package de.hfu;

import java.util.*;

public class Nachrichtendienst {

    private List<Empfaenger> angemeldeteEmpfaenger = new ArrayList<>();

    /**
     * @param nachricht    Zu sendende Nachricht
     * @param benutzername Gewünschter Empfänger
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
     * @param nachricht Zu sendende Nachricht
     */
    public void send(Nachricht nachricht) {
        for (Empfaenger empfaenger : angemeldeteEmpfaenger) {
            empfaenger.empfangen(nachricht);
        }
    }

    /**
     * @param empfaenger Anzumeldender Benutzer
     */
    public void anmelden(Empfaenger empfaenger) {
        angemeldeteEmpfaenger.add(empfaenger);
    }

    /**
     * @param empfaenger Abzumeldender Benutzer
     */
    public void abmelden(Empfaenger empfaenger) {
        angemeldeteEmpfaenger.remove(empfaenger);
    }

}