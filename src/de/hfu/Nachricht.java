package de.hfu;

import java.time.LocalDateTime;

public class Nachricht {

    private Sender sender;
    private LocalDateTime timeStamp;
    private Nachrichtentyp nachrichtentyp;
    private String titel;
    private String inhalt;

    public Nachricht(Sender sender, Nachrichtentyp nachrichtentyp, String titel, String inhalt)
    {
        this.sender = sender;
        this.nachrichtentyp = nachrichtentyp;
        this.titel = titel;
        this.inhalt = inhalt;
    }
}