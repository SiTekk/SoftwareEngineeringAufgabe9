package de.hfu;

public class Main {
    public static void main(String[] args) {
        Nachrichtendienst n = new Nachrichtendienst();

        Sender das_erste = new Sender("Das Erste");
        Sender zdf = new Sender("ZDF");

        Empfaenger empfaenger1 = new Empfaenger("Maesmade");
        Empfaenger empfaenger2 = new Empfaenger("Kienzles");

        n.anmelden(empfaenger1);
        n.anmelden(empfaenger2);

        Nachricht nachricht = new Nachricht(das_erste, Nachrichtentyp.Textnachricht, "Mogul wird erschossen", "XY ist gestorben");

        Nachricht nachricht1 = new Nachricht(zdf, Nachrichtentyp.Multimedianachricht, "Feuerwerk brennt Haus nieder", "https://player.vimeo.com/video/226635322?title=0&portrait=0&byline=0&autoplay=1&loop=1&transparent=1");

        n.send(nachricht, "Maesmade");

        n.send(nachricht1);

        n.abmelden(empfaenger1);
        n.abmelden(empfaenger2);


    }
}
